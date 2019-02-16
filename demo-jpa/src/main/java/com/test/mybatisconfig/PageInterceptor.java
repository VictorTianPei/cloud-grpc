package com.test.mybatisconfig;

import com.test.jdbcconfig.Page;
import com.test.jdbcconfig.PageOrder;
import org.apache.ibatis.executor.resultset.ResultSetHandler;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;

import java.sql.*;
import java.util.List;
import java.util.Properties;

@Intercepts({
		@Signature(type = StatementHandler.class, method = "prepare", args = {Connection.class, Integer.class}),
		@Signature(type = ResultSetHandler.class, method = "handleResultSets", args = {Statement.class})
})
public class PageInterceptor implements Interceptor {
	//插件运行的代码，它将代替原有的方法

	@Override
	public Object intercept(Invocation invocation) throws Throwable {
		System.out.println("PageInterceptor -- intercept");
		if (invocation.getTarget() instanceof StatementHandler) {
			StatementHandler statementHandler = (StatementHandler) invocation.getTarget();
			MetaObject metaStatementHandler = SystemMetaObject.forObject(statementHandler);
			MappedStatement mappedStatement=(MappedStatement) metaStatementHandler.getValue("delegate.mappedStatement");
			String selectId=mappedStatement.getId();
			if (selectId.endsWith("Page")) {
				BoundSql boundSql = (BoundSql) metaStatementHandler.getValue("delegate.boundSql");
				// 分页参数作为参数对象parameterObject的一个属性
				String sql = boundSql.getSql();
				String countSql = "SELECT count(*) FROM (" + sql + ") tab_";
				Page page = (Page) (boundSql.getParameterObject());

				int currentPage = page.getCurrentPage();
				int pageSize = page.getPageSize();

				int start = (currentPage - 1) * pageSize;
				StringBuilder newSql = new StringBuilder();
				newSql.append("SELECT * FROM (");
				newSql.append(sql);
				newSql.append(") tab_ ");
				List<PageOrder> pageOrderList = page.getPageOrderList();
				if (pageOrderList != null && !pageOrderList.isEmpty()) {
					newSql.append("order by ");
					for (PageOrder order : pageOrderList) {
						newSql.append(order.getKey() + " " + order.getDirection() + ",");
					}
					newSql.deleteCharAt(newSql.lastIndexOf(","));
				} else {

				}
				newSql.append(" limit ");
				newSql.append(start);
				newSql.append(", ");
				newSql.append(pageSize);
				String pageSql = newSql.toString();

				System.out.println("重写的 count  sql        :"+countSql);
				System.out.println("重写的 select sql        :"+pageSql);

				Connection connection = (Connection) invocation.getArgs()[0];
				PreparedStatement countStmt = null;
				ResultSet rs = null;
				int totalCount = 0;
				try {
					countStmt = connection.prepareStatement(countSql);
					rs = countStmt.executeQuery();
					if (rs.next()) {
						totalCount = rs.getInt(1);
					}

				} catch (SQLException e) {
					System.out.println("Ignore this exception" + e);
				} finally {
					try {
						rs.close();
						countStmt.close();
					} catch (SQLException e) {
						System.out.println("Ignore this exception" + e);
					}
				}
				page.setTotalCount(totalCount);

				metaStatementHandler.setValue("delegate.boundSql.sql", pageSql);
			}
		}
		return invocation.proceed();
	}

	// 拦截类型StatementHandler
	@Override
	public Object plugin(Object target) {
		if (target instanceof StatementHandler) {
			return Plugin.wrap(target, this);
		} else {
			return target;
		}
	}

	@Override
	public void setProperties(Properties properties) {
	}
}
