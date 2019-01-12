/**   
* @Title: GrpcClientController.java 
* @Package cn.com.tp 
* @Description: TODO(用一句话描述该文件做什么) 
* @author [tianpei] 
* @date 2019年1月7日 下午3:32:53 
* @version V1.0   
*/
package com.jw.platform.pcm.m4910.f010.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jw.platform.pcm.m4910.f010.service.GrpcClientService;

/**
 * ## 类说明：
 * 	描述
 * @author    [tianpei]   
 * @version   [V1.0, 2019年1月7日]
 * @package cn.com.tp
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2019年1月7日|tianpei|新增|GrpcClientController.java新增
*/
@RestController
public class GrpcClientController {

    @Autowired
    private GrpcClientService grpcClientService;

    @RequestMapping("/test")
    public String printMessage(@RequestParam(defaultValue = "Michael") String name) {
        return grpcClientService.sendMessage(name);
    }
    @RequestMapping("/test1")
    public String printMessage1(@RequestParam(defaultValue = "Michael") String name) {
    	return "3333333333333";
    }
}
