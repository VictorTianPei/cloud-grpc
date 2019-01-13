/**   
 * @Title: Application4100000G.java
 * @Package cn.com.tp 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author [tianpei] 
 * @date 2019年1月9日 下午4:23:07 
 * @version V1.0   
 */
package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

/**
 * ## 类说明：
 * 	描述
 * @author    [tianpei]   
 * @version   [V1.0, 2019年1月9日]
 * @package cn.com.tp
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2019年1月9日|tianpei|新增|Application4100000G.java新增
 */
@SpringBootApplication
public class Application4100000G {

	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes()
				//basic proxy
				.route(r -> r.path("/baidu")
						.uri("http://baidu.com:80/")
						).build();
	}

	public static void main(String[] args) {
		SpringApplication.run(Application4100000G.class, args);
	}
}