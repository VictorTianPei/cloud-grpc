package com.test;

import com.alibaba.fastjson.JSON;
import com.test.config.BaseRepositoryFactoryBean;
import com.test.domain.SysUser;
import com.test.jdbcconfig.JdbcDaoImpl;
import com.test.jdbcconfig.Page;
import com.test.jdbcconfig.PageOrder;
import com.test.jdbcconfig.jdbcDao;
import com.test.mapper.TestDao;
import com.test.repository.SysUserRepository;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;
import java.util.*;

@SpringBootApplication
@EnableJpaRepositories(repositoryFactoryBeanClass = BaseRepositoryFactoryBean.class)
@MapperScan("com.test.mapper")
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

	@Bean("jdbcDao")
	public jdbcDao getJdbcDao(DataSource dataSource) {
		return new JdbcDaoImpl(dataSource);
	}

	//@Bean
	public CommandLineRunner demo(SysUserRepository repository) {
		return (args) -> {
			// save a couple of customers
			SysUser sysUser = new SysUser("aaa1", "bbb");
			sysUser.setCreateDate(new Date());
			repository.encrySave(sysUser);
			//repository.save(new SysUser("Chloe", "O'Brian"));
			//repository.save(new SysUser("Kim", "Bauer"));
			//repository.save(new SysUser("David", "Palmer"));
			//repository.save(new SysUser("Michelle", "Dessler"));

			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (SysUser customer : repository.findAll()) {
				log.info(customer.toString());
			}
			log.info("");

			// fetch an individual customer by ID
			//repository.findById(1L)
			//		.ifPresent(customer -> {
			//			log.info("Customer found with findById(1L):");
			//			log.info("--------------------------------");
			//			log.info(customer.toString());
			//			log.info("");
			//		});
			// fetch customers by last name
			log.info("Customer found with findByLastName('Bauer'):");
			log.info("--------------------------------------------");
			List<SysUser> sysUsers = repository.queryListByProperties(new String[]{"userName","password"}, new Object[]{"Jack", "Bauer"});
			for (SysUser bauer : sysUsers) {
				log.info( JSON.toJSONString(bauer));
			}
			SysUser sysUser1 = repository.encryFindByProperties(new String[] {"userName", "password"}, new Object[] {"admin", "admin"});
			log.info(JSON.toJSONString(sysUser1));
			//int excute = repository.excute("insert into sys_user(user_name, password, nickname) values (:userName, :password, :nickname) ",
			//		new HashMap<String, Object>() {
			//			{
			//				this.put("userName", "tianpei");
			//				this.put("password", "tianpei");
			//				this.put("nickname", "tianpei");
			//			}
			//		});
			//log.info(excute+ "--------------");
		};
	}

	//@Autowired
	//jdbcDao jdbcDao;
	//@Bean
	//public CommandLineRunner demo2() {
	//	return args -> {
	//		Map<String, Object> params = new HashMap<>();
	//		params.put("userName", "aaa");
	//		Page page = new Page();
	//		page.setCurrentPage(1);
	//		page.setPageSize(2);
	//		List<PageOrder> orderList = new ArrayList();
	//		PageOrder order = new PageOrder("id", "desc");
	//		orderList.add(order);
	//		page.setPageOrderList(orderList);
	//		List list = jdbcDao.query("select * from sys_user where user_name = :userName", params, page);
	//		System.out.println(JSON.toJSONString(list));
	//		System.out.println("------------" + page.getTotalCount() + "--------------" + page.getTotalPage());
	//	};
	//}

	@Autowired
	TestDao testDao;
	@Bean
	public CommandLineRunner demo3() {
		return args -> {
			Page page = new Page();
			page.setCurrentPage(1);
			page.setPageSize(2);
			System.out.println(JSON.toJSONString(testDao.selectPage(page)));
		};
	}
}