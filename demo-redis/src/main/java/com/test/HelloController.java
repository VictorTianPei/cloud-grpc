/**   
* @Title: HelloController.java 
* @Package com.boot.microservice 
* @Description: TODO(用一句话描述该文件做什么) 
* @author [tianpei] 
* @date 2019年1月10日 下午3:05:22 
* @version V1.0   
*/
package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * ## 类说明：
 * 	描述
 * @author    [tianpei]   
 * @version   [V1.0, 2019年1月10日]
 * @package com.boot.microservice
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2019年1月10日|tianpei|新增|HelloController.java新增
*/
@RestController
public class HelloController {

    @Autowired
    private RedisConfig.RedisUtil redisUtil ;

    @RequestMapping(value = "/redisTest",method = RequestMethod.GET)
    public String redisTest(){
        redisUtil.set("123","888");
        return redisUtil.get("123").toString();
    }
}
