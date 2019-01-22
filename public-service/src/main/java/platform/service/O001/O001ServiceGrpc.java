package platform.service.O001;

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
    comments = "Source: proto/service-proto/o001.proto")
public final class O001ServiceGrpc {

  private O001ServiceGrpc() {}

  public static final String SERVICE_NAME = "Platform.Service.O001.O001Service";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<platform.service.O001.SendMessageRequest,
      platform.service.O001.SendMessageResponse> getSendMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendMessage",
      requestType = platform.service.O001.SendMessageRequest.class,
      responseType = platform.service.O001.SendMessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<platform.service.O001.SendMessageRequest,
      platform.service.O001.SendMessageResponse> getSendMessageMethod() {
    io.grpc.MethodDescriptor<platform.service.O001.SendMessageRequest, platform.service.O001.SendMessageResponse> getSendMessageMethod;
    if ((getSendMessageMethod = O001ServiceGrpc.getSendMessageMethod) == null) {
      synchronized (O001ServiceGrpc.class) {
        if ((getSendMessageMethod = O001ServiceGrpc.getSendMessageMethod) == null) {
          O001ServiceGrpc.getSendMessageMethod = getSendMessageMethod = 
              io.grpc.MethodDescriptor.<platform.service.O001.SendMessageRequest, platform.service.O001.SendMessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Platform.Service.O001.O001Service", "sendMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  platform.service.O001.SendMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  platform.service.O001.SendMessageResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new O001ServiceMethodDescriptorSupplier("sendMessage"))
                  .build();
          }
        }
     }
     return getSendMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<platform.service.O001.SendMessageRequest,
      platform.service.O001.SendMessageResponse> getSendExpMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendExpMessage",
      requestType = platform.service.O001.SendMessageRequest.class,
      responseType = platform.service.O001.SendMessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<platform.service.O001.SendMessageRequest,
      platform.service.O001.SendMessageResponse> getSendExpMessageMethod() {
    io.grpc.MethodDescriptor<platform.service.O001.SendMessageRequest, platform.service.O001.SendMessageResponse> getSendExpMessageMethod;
    if ((getSendExpMessageMethod = O001ServiceGrpc.getSendExpMessageMethod) == null) {
      synchronized (O001ServiceGrpc.class) {
        if ((getSendExpMessageMethod = O001ServiceGrpc.getSendExpMessageMethod) == null) {
          O001ServiceGrpc.getSendExpMessageMethod = getSendExpMessageMethod = 
              io.grpc.MethodDescriptor.<platform.service.O001.SendMessageRequest, platform.service.O001.SendMessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Platform.Service.O001.O001Service", "sendExpMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  platform.service.O001.SendMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  platform.service.O001.SendMessageResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new O001ServiceMethodDescriptorSupplier("sendExpMessage"))
                  .build();
          }
        }
     }
     return getSendExpMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<platform.service.O001.SmsSearchRequest,
      platform.service.O001.SmsSearchResponse> getSearchReportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "searchReport",
      requestType = platform.service.O001.SmsSearchRequest.class,
      responseType = platform.service.O001.SmsSearchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<platform.service.O001.SmsSearchRequest,
      platform.service.O001.SmsSearchResponse> getSearchReportMethod() {
    io.grpc.MethodDescriptor<platform.service.O001.SmsSearchRequest, platform.service.O001.SmsSearchResponse> getSearchReportMethod;
    if ((getSearchReportMethod = O001ServiceGrpc.getSearchReportMethod) == null) {
      synchronized (O001ServiceGrpc.class) {
        if ((getSearchReportMethod = O001ServiceGrpc.getSearchReportMethod) == null) {
          O001ServiceGrpc.getSearchReportMethod = getSearchReportMethod = 
              io.grpc.MethodDescriptor.<platform.service.O001.SmsSearchRequest, platform.service.O001.SmsSearchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Platform.Service.O001.O001Service", "searchReport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  platform.service.O001.SmsSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  platform.service.O001.SmsSearchResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new O001ServiceMethodDescriptorSupplier("searchReport"))
                  .build();
          }
        }
     }
     return getSearchReportMethod;
  }

  private static volatile io.grpc.MethodDescriptor<platform.service.O001.SmsSearchRequest,
      platform.service.O001.SmsSearchResponse> getSearchMosMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "searchMosMessage",
      requestType = platform.service.O001.SmsSearchRequest.class,
      responseType = platform.service.O001.SmsSearchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<platform.service.O001.SmsSearchRequest,
      platform.service.O001.SmsSearchResponse> getSearchMosMessageMethod() {
    io.grpc.MethodDescriptor<platform.service.O001.SmsSearchRequest, platform.service.O001.SmsSearchResponse> getSearchMosMessageMethod;
    if ((getSearchMosMessageMethod = O001ServiceGrpc.getSearchMosMessageMethod) == null) {
      synchronized (O001ServiceGrpc.class) {
        if ((getSearchMosMessageMethod = O001ServiceGrpc.getSearchMosMessageMethod) == null) {
          O001ServiceGrpc.getSearchMosMessageMethod = getSearchMosMessageMethod = 
              io.grpc.MethodDescriptor.<platform.service.O001.SmsSearchRequest, platform.service.O001.SmsSearchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Platform.Service.O001.O001Service", "searchMosMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  platform.service.O001.SmsSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  platform.service.O001.SmsSearchResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new O001ServiceMethodDescriptorSupplier("searchMosMessage"))
                  .build();
          }
        }
     }
     return getSearchMosMessageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static O001ServiceStub newStub(io.grpc.Channel channel) {
    return new O001ServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static O001ServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new O001ServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static O001ServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new O001ServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class O001ServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 发送普通短信
     * </pre>
     */
    public void sendMessage(platform.service.O001.SendMessageRequest request,
        io.grpc.stub.StreamObserver<platform.service.O001.SendMessageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendMessageMethod(), responseObserver);
    }

    /**
     * <pre>
     * 发送模板短信
     * </pre>
     */
    public void sendExpMessage(platform.service.O001.SendMessageRequest request,
        io.grpc.stub.StreamObserver<platform.service.O001.SendMessageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendExpMessageMethod(), responseObserver);
    }

    /**
     * <pre>
     * 查询短信报告
     * </pre>
     */
    public void searchReport(platform.service.O001.SmsSearchRequest request,
        io.grpc.stub.StreamObserver<platform.service.O001.SmsSearchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchReportMethod(), responseObserver);
    }

    /**
     * <pre>
     * 查询上行数据
     * </pre>
     */
    public void searchMosMessage(platform.service.O001.SmsSearchRequest request,
        io.grpc.stub.StreamObserver<platform.service.O001.SmsSearchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchMosMessageMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendMessageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                platform.service.O001.SendMessageRequest,
                platform.service.O001.SendMessageResponse>(
                  this, METHODID_SEND_MESSAGE)))
          .addMethod(
            getSendExpMessageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                platform.service.O001.SendMessageRequest,
                platform.service.O001.SendMessageResponse>(
                  this, METHODID_SEND_EXP_MESSAGE)))
          .addMethod(
            getSearchReportMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                platform.service.O001.SmsSearchRequest,
                platform.service.O001.SmsSearchResponse>(
                  this, METHODID_SEARCH_REPORT)))
          .addMethod(
            getSearchMosMessageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                platform.service.O001.SmsSearchRequest,
                platform.service.O001.SmsSearchResponse>(
                  this, METHODID_SEARCH_MOS_MESSAGE)))
          .build();
    }
  }

  /**
   */
  public static final class O001ServiceStub extends io.grpc.stub.AbstractStub<O001ServiceStub> {
    private O001ServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private O001ServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected O001ServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new O001ServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 发送普通短信
     * </pre>
     */
    public void sendMessage(platform.service.O001.SendMessageRequest request,
        io.grpc.stub.StreamObserver<platform.service.O001.SendMessageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 发送模板短信
     * </pre>
     */
    public void sendExpMessage(platform.service.O001.SendMessageRequest request,
        io.grpc.stub.StreamObserver<platform.service.O001.SendMessageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendExpMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 查询短信报告
     * </pre>
     */
    public void searchReport(platform.service.O001.SmsSearchRequest request,
        io.grpc.stub.StreamObserver<platform.service.O001.SmsSearchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchReportMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 查询上行数据
     * </pre>
     */
    public void searchMosMessage(platform.service.O001.SmsSearchRequest request,
        io.grpc.stub.StreamObserver<platform.service.O001.SmsSearchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchMosMessageMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class O001ServiceBlockingStub extends io.grpc.stub.AbstractStub<O001ServiceBlockingStub> {
    private O001ServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private O001ServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected O001ServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new O001ServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 发送普通短信
     * </pre>
     */
    public platform.service.O001.SendMessageResponse sendMessage(platform.service.O001.SendMessageRequest request) {
      return blockingUnaryCall(
          getChannel(), getSendMessageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 发送模板短信
     * </pre>
     */
    public platform.service.O001.SendMessageResponse sendExpMessage(platform.service.O001.SendMessageRequest request) {
      return blockingUnaryCall(
          getChannel(), getSendExpMessageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 查询短信报告
     * </pre>
     */
    public platform.service.O001.SmsSearchResponse searchReport(platform.service.O001.SmsSearchRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchReportMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 查询上行数据
     * </pre>
     */
    public platform.service.O001.SmsSearchResponse searchMosMessage(platform.service.O001.SmsSearchRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchMosMessageMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class O001ServiceFutureStub extends io.grpc.stub.AbstractStub<O001ServiceFutureStub> {
    private O001ServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private O001ServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected O001ServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new O001ServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 发送普通短信
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<platform.service.O001.SendMessageResponse> sendMessage(
        platform.service.O001.SendMessageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSendMessageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 发送模板短信
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<platform.service.O001.SendMessageResponse> sendExpMessage(
        platform.service.O001.SendMessageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSendExpMessageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 查询短信报告
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<platform.service.O001.SmsSearchResponse> searchReport(
        platform.service.O001.SmsSearchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchReportMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 查询上行数据
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<platform.service.O001.SmsSearchResponse> searchMosMessage(
        platform.service.O001.SmsSearchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchMosMessageMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_MESSAGE = 0;
  private static final int METHODID_SEND_EXP_MESSAGE = 1;
  private static final int METHODID_SEARCH_REPORT = 2;
  private static final int METHODID_SEARCH_MOS_MESSAGE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final O001ServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(O001ServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_MESSAGE:
          serviceImpl.sendMessage((platform.service.O001.SendMessageRequest) request,
              (io.grpc.stub.StreamObserver<platform.service.O001.SendMessageResponse>) responseObserver);
          break;
        case METHODID_SEND_EXP_MESSAGE:
          serviceImpl.sendExpMessage((platform.service.O001.SendMessageRequest) request,
              (io.grpc.stub.StreamObserver<platform.service.O001.SendMessageResponse>) responseObserver);
          break;
        case METHODID_SEARCH_REPORT:
          serviceImpl.searchReport((platform.service.O001.SmsSearchRequest) request,
              (io.grpc.stub.StreamObserver<platform.service.O001.SmsSearchResponse>) responseObserver);
          break;
        case METHODID_SEARCH_MOS_MESSAGE:
          serviceImpl.searchMosMessage((platform.service.O001.SmsSearchRequest) request,
              (io.grpc.stub.StreamObserver<platform.service.O001.SmsSearchResponse>) responseObserver);
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

  private static abstract class O001ServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    O001ServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return platform.service.O001.O001.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("O001Service");
    }
  }

  private static final class O001ServiceFileDescriptorSupplier
      extends O001ServiceBaseDescriptorSupplier {
    O001ServiceFileDescriptorSupplier() {}
  }

  private static final class O001ServiceMethodDescriptorSupplier
      extends O001ServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    O001ServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (O001ServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new O001ServiceFileDescriptorSupplier())
              .addMethod(getSendMessageMethod())
              .addMethod(getSendExpMessageMethod())
              .addMethod(getSearchReportMethod())
              .addMethod(getSearchMosMessageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
