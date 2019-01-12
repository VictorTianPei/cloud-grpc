/**   
 * @Title: ServletInitializer.java 
 * @Package com.boot.microservice 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author [tianpei] 
 * @date 2019年1月10日 下午2:17:56 
 * @version V1.0   
 */
package com.jw;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * ## 类说明：
 * 	描述
 * @author    [tianpei]   
 * @version   [V1.0, 2019年1月10日]
 * @package com.boot.microservice
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2019年1月10日|tianpei|新增|ServletInitializer.java新增
 */
public class ServletInitializer extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application4910010R.class);
	}
}
