/**   
* @Title: GrpcClientService.java 
* @Package cn.com.tp 
* @Description: TODO(用一句话描述该文件做什么) 
* @author [tianpei] 
* @date 2019年1月7日 下午3:31:43 
* @version V1.0   
*/
package com.jw.platform.pcm.m4910.f010.service;


import com.jw.platform.pcm.m4910.f010.microservice.GreeterGrpc;
import com.jw.platform.pcm.m4910.f010.microservice.GreeterProto;
import org.springframework.stereotype.Service;

import io.grpc.Channel;
import net.devh.springboot.autoconfigure.grpc.client.GrpcClient;

/**
 * ## 类说明：
 * 	描述
 * @author    [tianpei]   
 * @version   [V1.0, 2019年1月7日]
 * @package cn.com.tp
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2019年1月7日|tianpei|新增|GrpcClientService.java新增
*/
@Service
public class GrpcClientService {

    @GrpcClient("boot-4910010R")
    private Channel serverChannel;

    public String sendMessage(String name) {
        GreeterGrpc.GreeterBlockingStub stub= GreeterGrpc.newBlockingStub(serverChannel);
        GreeterProto.HelloReply response = stub.sayHello(GreeterProto.HelloRequest.newBuilder().setName(name).build());
        return response.getMessage();
    }
}