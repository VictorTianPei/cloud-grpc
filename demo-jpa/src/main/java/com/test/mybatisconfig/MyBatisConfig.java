/**   
 * @Title: MyBatisConfig.java 
 * @Package com.boot.microservice 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author [tianpei] 
 * @date 2019年1月10日 下午4:31:15 
 * @version V1.0   
 */
package com.test.mybatisconfig;

import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.sql.DataSource;

/**
 * ## 类说明：
 * 	描述
 * @author    [tianpei]   
 * @version   [V1.0, 2019年1月10日]
 * @package com.boot.microservice
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2019年1月10日|tianpei|新增|MyBatisConfig.java新增
 */
@Configuration
//加上这个注解，使得支持事务
@EnableTransactionManagement
public class MyBatisConfig {

	@Bean(name = "sqlSessionFactory")
	public SqlSessionFactory sqlSessionFactoryBean(DataSource dataSource) throws Exception {
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(dataSource);
		Interceptor[] interceptors = new Interceptor[2];
		interceptors[0] = new ExamplePlugin();
		interceptors[1] = new PageInterceptor();
		bean.setPlugins(interceptors);
		return bean.getObject();
	}

	@Bean
	public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
		return new SqlSessionTemplate(sqlSessionFactory);
	}
}
