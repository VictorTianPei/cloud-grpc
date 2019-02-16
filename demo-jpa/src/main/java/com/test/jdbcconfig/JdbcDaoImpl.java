package com.test.jdbcconfig;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JdbcDaoImpl implements jdbcDao{

	private final NamedParameterJdbcTemplate jdbcTemplate;

	public JdbcDaoImpl(DataSource dataSource) {
		this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	@Override
	public List<Map<String, Object>> query(String sql) {
		return query(sql, new HashMap<>(0));
	}

	@Override
	public List<Map<String, Object>> query(String sql, Map<String, Object> params) {
		return jdbcTemplate.queryForList(sql, params);
	}

	@Override
	public List<Map<String, Object>> query(String sql, Page page) {
		return query(sql, new HashMap<>(0), page);
	}

	@Override
	public List<Map<String, Object>> query(String sql, Map<String, Object> params, Page page) {
		if (page != null && page.getCurrentPage() != null && page.getPageSize() != null) {
			int rows = getTotalCount(sql, params);
			page.setTotalCount(rows);
			int currentPage = page.getCurrentPage();
			int pageSize = page.getPageSize();
			int totalPage = 0;
			if (rows % pageSize == 0) {
				totalPage = rows / pageSize;
			} else {
				totalPage = rows / pageSize + 1;
			}
			page.setTotalPage(totalPage);
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
			sql = newSql.toString();
		}
		return query(sql, params);
	}

	@Override
	public int getTotalCount(String sql) {
		return getTotalCount(sql, new HashMap<>(0));
	}

	@Override
	public int getTotalCount(String sql, Map<String, Object> params) {
		String countSql = "SELECT count(*) FROM (" + sql +") tab_";
		return jdbcTemplate.queryForObject(countSql, params, Integer.class);
	}
}
