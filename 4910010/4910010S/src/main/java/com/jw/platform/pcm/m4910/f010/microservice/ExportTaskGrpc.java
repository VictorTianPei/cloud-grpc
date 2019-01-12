package com.jw.platform.pcm.m4910.f010.microservice;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * 导出任务服务定义
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.1)",
    comments = "Source: proto/exporttask.proto")
public final class ExportTaskGrpc {

  private ExportTaskGrpc() {}

  public static final String SERVICE_NAME = "exporttask.ExportTask";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplReq,
      com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplRes> getCreateTplMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTpl",
      requestType = com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplReq.class,
      responseType = com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplReq,
      com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplRes> getCreateTplMethod() {
    io.grpc.MethodDescriptor<com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplReq, com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplRes> getCreateTplMethod;
    if ((getCreateTplMethod = ExportTaskGrpc.getCreateTplMethod) == null) {
      synchronized (ExportTaskGrpc.class) {
        if ((getCreateTplMethod = ExportTaskGrpc.getCreateTplMethod) == null) {
          ExportTaskGrpc.getCreateTplMethod = getCreateTplMethod = 
              io.grpc.MethodDescriptor.<com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplReq, com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "exporttask.ExportTask", "CreateTpl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplRes.getDefaultInstance()))
                  .setSchemaDescriptor(new ExportTaskMethodDescriptorSupplier("CreateTpl"))
                  .build();
          }
        }
     }
     return getCreateTplMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplReq,
      com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplRes> getListTplMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTpl",
      requestType = com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplReq.class,
      responseType = com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplReq,
      com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplRes> getListTplMethod() {
    io.grpc.MethodDescriptor<com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplReq, com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplRes> getListTplMethod;
    if ((getListTplMethod = ExportTaskGrpc.getListTplMethod) == null) {
      synchronized (ExportTaskGrpc.class) {
        if ((getListTplMethod = ExportTaskGrpc.getListTplMethod) == null) {
          ExportTaskGrpc.getListTplMethod = getListTplMethod = 
              io.grpc.MethodDescriptor.<com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplReq, com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "exporttask.ExportTask", "ListTpl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplRes.getDefaultInstance()))
                  .setSchemaDescriptor(new ExportTaskMethodDescriptorSupplier("ListTpl"))
                  .build();
          }
        }
     }
     return getListTplMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ExportTaskStub newStub(io.grpc.Channel channel) {
    return new ExportTaskStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ExportTaskBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ExportTaskBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ExportTaskFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ExportTaskFutureStub(channel);
  }

  /**
   * <pre>
   * 导出任务服务定义
   * </pre>
   */
  public static abstract class ExportTaskImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 创建任务模板
     * </pre>
     */
    public void createTpl(com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplReq request,
        io.grpc.stub.StreamObserver<com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplRes> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateTplMethod(), responseObserver);
    }

    /**
     * <pre>
     * 查询任务模板
     * </pre>
     */
    public void listTpl(com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplReq request,
        io.grpc.stub.StreamObserver<com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListTplMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateTplMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplReq,
                com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplRes>(
                  this, METHODID_CREATE_TPL)))
          .addMethod(
            getListTplMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplReq,
                com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplRes>(
                  this, METHODID_LIST_TPL)))
          .build();
    }
  }

  /**
   * <pre>
   * 导出任务服务定义
   * </pre>
   */
  public static final class ExportTaskStub extends io.grpc.stub.AbstractStub<ExportTaskStub> {
    private ExportTaskStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ExportTaskStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExportTaskStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ExportTaskStub(channel, callOptions);
    }

    /**
     * <pre>
     * 创建任务模板
     * </pre>
     */
    public void createTpl(com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplReq request,
        io.grpc.stub.StreamObserver<com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateTplMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 查询任务模板
     * </pre>
     */
    public void listTpl(com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplReq request,
        io.grpc.stub.StreamObserver<com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListTplMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * 导出任务服务定义
   * </pre>
   */
  public static final class ExportTaskBlockingStub extends io.grpc.stub.AbstractStub<ExportTaskBlockingStub> {
    private ExportTaskBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ExportTaskBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExportTaskBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ExportTaskBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 创建任务模板
     * </pre>
     */
    public com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplRes createTpl(com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplReq request) {
      return blockingUnaryCall(
          getChannel(), getCreateTplMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 查询任务模板
     * </pre>
     */
    public com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplRes listTpl(com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplReq request) {
      return blockingUnaryCall(
          getChannel(), getListTplMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * 导出任务服务定义
   * </pre>
   */
  public static final class ExportTaskFutureStub extends io.grpc.stub.AbstractStub<ExportTaskFutureStub> {
    private ExportTaskFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ExportTaskFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExportTaskFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ExportTaskFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 创建任务模板
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplRes> createTpl(
        com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplReq request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateTplMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 查询任务模板
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplRes> listTpl(
        com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListTplMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_TPL = 0;
  private static final int METHODID_LIST_TPL = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ExportTaskImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ExportTaskImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_TPL:
          serviceImpl.createTpl((com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplReq) request,
              (io.grpc.stub.StreamObserver<com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskCreateTplRes>) responseObserver);
          break;
        case METHODID_LIST_TPL:
          serviceImpl.listTpl((com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplReq) request,
              (io.grpc.stub.StreamObserver<com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskListTplRes>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ExportTaskBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ExportTaskBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.jw.platform.pcm.m4910.f010.microservice.WshExportTaskProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ExportTask");
    }
  }

  private static final class ExportTaskFileDescriptorSupplier
      extends ExportTaskBaseDescriptorSupplier {
    ExportTaskFileDescriptorSupplier() {}
  }

  private static final class ExportTaskMethodDescriptorSupplier
      extends ExportTaskBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ExportTaskMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ExportTaskGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ExportTaskFileDescriptorSupplier())
              .addMethod(getCreateTplMethod())
              .addMethod(getListTplMethod())
              .build();
        }
      }
    }
    return result;
  }
}
