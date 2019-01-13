/**   
* @Title: MyBatisMapperScannerConfig.java 
* @Package com.boot.microservice 
* @Description: TODO(用一句话描述该文件做什么) 
* @author [tianpei] 
* @date 2019年1月10日 下午4:47:14 
* @version V1.0   
*/
package com.test;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ## 类说明：
 * 	描述
 * @author    [tianpei]   
 * @version   [V1.0, 2019年1月10日]
 * @package com.boot.microservice
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2019年1月10日|tianpei|新增|MyBatisMapperScannerConfig.java新增
*/
@Configuration
//因为这个对象的扫描，需要在MyBatisConfig的后面注入，所以加上下面的注解
@AutoConfigureAfter(MyBatisConfig.class)
public class MyBatisMapperScannerConfig {
 @Bean
 public MapperScannerConfigurer mapperScannerConfigurer() {
     MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
     //获取之前注入的beanName为sqlSessionFactory的对象
     mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
     //指定xml配置文件的路径
     mapperScannerConfigurer.setBasePackage("com.framework.msg.mapper");
     return mapperScannerConfigurer;
 }
}
