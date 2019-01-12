/**   
* @Title: GreeterServic.java 
* @Package cn.com.tp 
* @Description: TODO(用一句话描述该文件做什么) 
* @author [tianpei] 
* @date 2019年1月4日 下午5:53:31 
* @version V1.0   
*/
package com.jw.platform.pcm.m4910.f010.microserviceimpl;

import com.jw.platform.pcm.m4910.f010.microservice.GreeterGrpc;
import com.jw.platform.pcm.m4910.f010.microservice.GreeterOuterClass;

import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.springboot.autoconfigure.grpc.server.GrpcService;

/**
 * ## 类说明：
 * 	描述
 * @author    [tianpei]   
 * @version   [V1.0, 2019年1月4日]
 * @package cn.com.tp
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2019年1月4日|tianpei|新增|GreeterServic.java新增
*/
//@Slf4j
@GrpcService(GreeterOuterClass.class)
public class GreeterService extends GreeterGrpc.GreeterImplBase {
    @Override
    public void sayHello(GreeterOuterClass.HelloRequest request, StreamObserver<GreeterOuterClass.HelloReply> responseObserver) {
        String message = "Hello333344444 " + request.getName();
        final GreeterOuterClass.HelloReply.Builder replyBuilder = GreeterOuterClass.HelloReply.newBuilder().setMessage(message);
        responseObserver.onNext(replyBuilder.build());
        responseObserver.onCompleted();
      //  log.info("Returning " +message);
    }
}
