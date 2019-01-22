package platform.service.ht00100;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.1)",
    comments = "Source: proto/service-proto/ht00100.proto")
public final class Ht00100ServiceGrpc {

  private Ht00100ServiceGrpc() {}

  public static final String SERVICE_NAME = "Platform.Service.ht00100.Ht00100Service";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<platform.service.ht00100.SendMessageRequest,
      platform.service.ht00100.SendMessageResponse> getSendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "send",
      requestType = platform.service.ht00100.SendMessageRequest.class,
      responseType = platform.service.ht00100.SendMessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<platform.service.ht00100.SendMessageRequest,
      platform.service.ht00100.SendMessageResponse> getSendMethod() {
    io.grpc.MethodDescriptor<platform.service.ht00100.SendMessageRequest, platform.service.ht00100.SendMessageResponse> getSendMethod;
    if ((getSendMethod = Ht00100ServiceGrpc.getSendMethod) == null) {
      synchronized (Ht00100ServiceGrpc.class) {
        if ((getSendMethod = Ht00100ServiceGrpc.getSendMethod) == null) {
          Ht00100ServiceGrpc.getSendMethod = getSendMethod = 
              io.grpc.MethodDescriptor.<platform.service.ht00100.SendMessageRequest, platform.service.ht00100.SendMessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Platform.Service.ht00100.Ht00100Service", "send"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  platform.service.ht00100.SendMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  platform.service.ht00100.SendMessageResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Ht00100ServiceMethodDescriptorSupplier("send"))
                  .build();
          }
        }
     }
     return getSendMethod;
  }

  private static volatile io.grpc.MethodDescriptor<platform.service.ht00100.MessageListRequest,
      platform.service.ht00100.MessageListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "list",
      requestType = platform.service.ht00100.MessageListRequest.class,
      responseType = platform.service.ht00100.MessageListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<platform.service.ht00100.MessageListRequest,
      platform.service.ht00100.MessageListResponse> getListMethod() {
    io.grpc.MethodDescriptor<platform.service.ht00100.MessageListRequest, platform.service.ht00100.MessageListResponse> getListMethod;
    if ((getListMethod = Ht00100ServiceGrpc.getListMethod) == null) {
      synchronized (Ht00100ServiceGrpc.class) {
        if ((getListMethod = Ht00100ServiceGrpc.getListMethod) == null) {
          Ht00100ServiceGrpc.getListMethod = getListMethod = 
              io.grpc.MethodDescriptor.<platform.service.ht00100.MessageListRequest, platform.service.ht00100.MessageListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Platform.Service.ht00100.Ht00100Service", "list"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  platform.service.ht00100.MessageListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  platform.service.ht00100.MessageListResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Ht00100ServiceMethodDescriptorSupplier("list"))
                  .build();
          }
        }
     }
     return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static Ht00100ServiceStub newStub(io.grpc.Channel channel) {
    return new Ht00100ServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static Ht00100ServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new Ht00100ServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static Ht00100ServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new Ht00100ServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class Ht00100ServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *发送短信消息
     * </pre>
     */
    public void send(platform.service.ht00100.SendMessageRequest request,
        io.grpc.stub.StreamObserver<platform.service.ht00100.SendMessageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendMethod(), responseObserver);
    }

    /**
     * <pre>
     *查询短信消息列表
     * </pre>
     */
    public void list(platform.service.ht00100.MessageListRequest request,
        io.grpc.stub.StreamObserver<platform.service.ht00100.MessageListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                platform.service.ht00100.SendMessageRequest,
                platform.service.ht00100.SendMessageResponse>(
                  this, METHODID_SEND)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                platform.service.ht00100.MessageListRequest,
                platform.service.ht00100.MessageListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   */
  public static final class Ht00100ServiceStub extends io.grpc.stub.AbstractStub<Ht00100ServiceStub> {
    private Ht00100ServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Ht00100ServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Ht00100ServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Ht00100ServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *发送短信消息
     * </pre>
     */
    public void send(platform.service.ht00100.SendMessageRequest request,
        io.grpc.stub.StreamObserver<platform.service.ht00100.SendMessageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *查询短信消息列表
     * </pre>
     */
    public void list(platform.service.ht00100.MessageListRequest request,
        io.grpc.stub.StreamObserver<platform.service.ht00100.MessageListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class Ht00100ServiceBlockingStub extends io.grpc.stub.AbstractStub<Ht00100ServiceBlockingStub> {
    private Ht00100ServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Ht00100ServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Ht00100ServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Ht00100ServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *发送短信消息
     * </pre>
     */
    public platform.service.ht00100.SendMessageResponse send(platform.service.ht00100.SendMessageRequest request) {
      return blockingUnaryCall(
          getChannel(), getSendMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *查询短信消息列表
     * </pre>
     */
    public platform.service.ht00100.MessageListResponse list(platform.service.ht00100.MessageListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class Ht00100ServiceFutureStub extends io.grpc.stub.AbstractStub<Ht00100ServiceFutureStub> {
    private Ht00100ServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Ht00100ServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Ht00100ServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Ht00100ServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *发送短信消息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<platform.service.ht00100.SendMessageResponse> send(
        platform.service.ht00100.SendMessageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSendMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *查询短信消息列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<platform.service.ht00100.MessageListResponse> list(
        platform.service.ht00100.MessageListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND = 0;
  private static final int METHODID_LIST = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final Ht00100ServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(Ht00100ServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND:
          serviceImpl.send((platform.service.ht00100.SendMessageRequest) request,
              (io.grpc.stub.StreamObserver<platform.service.ht00100.SendMessageResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((platform.service.ht00100.MessageListRequest) request,
              (io.grpc.stub.StreamObserver<platform.service.ht00100.MessageListResponse>) responseObserver);
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

  private static abstract class Ht00100ServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    Ht00100ServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return platform.service.ht00100.Ht00100.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Ht00100Service");
    }
  }

  private static final class Ht00100ServiceFileDescriptorSupplier
      extends Ht00100ServiceBaseDescriptorSupplier {
    Ht00100ServiceFileDescriptorSupplier() {}
  }

  private static final class Ht00100ServiceMethodDescriptorSupplier
      extends Ht00100ServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    Ht00100ServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (Ht00100ServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new Ht00100ServiceFileDescriptorSupplier())
              .addMethod(getSendMethod())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
