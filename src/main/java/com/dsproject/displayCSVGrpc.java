package com.dsproject;

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

public final class displayCSVGrpc {

  private displayCSVGrpc() {}

  public static final String SERVICE_NAME = "displayCSV";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dsproject.displayRequest,
      com.dsproject.displayResponse> getDisplayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "display",
      requestType = com.dsproject.displayRequest.class,
      responseType = com.dsproject.displayResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dsproject.displayRequest,
      com.dsproject.displayResponse> getDisplayMethod() {
    io.grpc.MethodDescriptor<com.dsproject.displayRequest, com.dsproject.displayResponse> getDisplayMethod;
    if ((getDisplayMethod = displayCSVGrpc.getDisplayMethod) == null) {
      synchronized (displayCSVGrpc.class) {
        if ((getDisplayMethod = displayCSVGrpc.getDisplayMethod) == null) {
          displayCSVGrpc.getDisplayMethod = getDisplayMethod = 
              io.grpc.MethodDescriptor.<com.dsproject.displayRequest, com.dsproject.displayResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "displayCSV", "display"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dsproject.displayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dsproject.displayResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new displayCSVMethodDescriptorSupplier("display"))
                  .build();
          }
        }
     }
     return getDisplayMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dsproject.tdRequest,
      com.dsproject.tdResponse> getTerminateDisplayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "terminateDisplay",
      requestType = com.dsproject.tdRequest.class,
      responseType = com.dsproject.tdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dsproject.tdRequest,
      com.dsproject.tdResponse> getTerminateDisplayMethod() {
    io.grpc.MethodDescriptor<com.dsproject.tdRequest, com.dsproject.tdResponse> getTerminateDisplayMethod;
    if ((getTerminateDisplayMethod = displayCSVGrpc.getTerminateDisplayMethod) == null) {
      synchronized (displayCSVGrpc.class) {
        if ((getTerminateDisplayMethod = displayCSVGrpc.getTerminateDisplayMethod) == null) {
          displayCSVGrpc.getTerminateDisplayMethod = getTerminateDisplayMethod = 
              io.grpc.MethodDescriptor.<com.dsproject.tdRequest, com.dsproject.tdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "displayCSV", "terminateDisplay"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dsproject.tdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dsproject.tdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new displayCSVMethodDescriptorSupplier("terminateDisplay"))
                  .build();
          }
        }
     }
     return getTerminateDisplayMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static displayCSVStub newStub(io.grpc.Channel channel) {
    return new displayCSVStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static displayCSVBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new displayCSVBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static displayCSVFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new displayCSVFutureStub(channel);
  }

  /**
   */
  public static abstract class displayCSVImplBase implements io.grpc.BindableService {

    /**
     */
    public void display(com.dsproject.displayRequest request,
        io.grpc.stub.StreamObserver<com.dsproject.displayResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDisplayMethod(), responseObserver);
    }

    /**
     */
    public void terminateDisplay(com.dsproject.tdRequest request,
        io.grpc.stub.StreamObserver<com.dsproject.tdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTerminateDisplayMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDisplayMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.dsproject.displayRequest,
                com.dsproject.displayResponse>(
                  this, METHODID_DISPLAY)))
          .addMethod(
            getTerminateDisplayMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.dsproject.tdRequest,
                com.dsproject.tdResponse>(
                  this, METHODID_TERMINATE_DISPLAY)))
          .build();
    }
  }

  /**
   */
  public static final class displayCSVStub extends io.grpc.stub.AbstractStub<displayCSVStub> {
    private displayCSVStub(io.grpc.Channel channel) {
      super(channel);
    }

    private displayCSVStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected displayCSVStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new displayCSVStub(channel, callOptions);
    }

    /**
     */
    public void display(com.dsproject.displayRequest request,
        io.grpc.stub.StreamObserver<com.dsproject.displayResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDisplayMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void terminateDisplay(com.dsproject.tdRequest request,
        io.grpc.stub.StreamObserver<com.dsproject.tdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTerminateDisplayMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class displayCSVBlockingStub extends io.grpc.stub.AbstractStub<displayCSVBlockingStub> {
    private displayCSVBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private displayCSVBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected displayCSVBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new displayCSVBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.dsproject.displayResponse display(com.dsproject.displayRequest request) {
      return blockingUnaryCall(
          getChannel(), getDisplayMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dsproject.tdResponse terminateDisplay(com.dsproject.tdRequest request) {
      return blockingUnaryCall(
          getChannel(), getTerminateDisplayMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class displayCSVFutureStub extends io.grpc.stub.AbstractStub<displayCSVFutureStub> {
    private displayCSVFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private displayCSVFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected displayCSVFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new displayCSVFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dsproject.displayResponse> display(
        com.dsproject.displayRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDisplayMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dsproject.tdResponse> terminateDisplay(
        com.dsproject.tdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTerminateDisplayMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DISPLAY = 0;
  private static final int METHODID_TERMINATE_DISPLAY = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final displayCSVImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(displayCSVImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DISPLAY:
          serviceImpl.display((com.dsproject.displayRequest) request,
              (io.grpc.stub.StreamObserver<com.dsproject.displayResponse>) responseObserver);
          break;
        case METHODID_TERMINATE_DISPLAY:
          serviceImpl.terminateDisplay((com.dsproject.tdRequest) request,
              (io.grpc.stub.StreamObserver<com.dsproject.tdResponse>) responseObserver);
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

  private static abstract class displayCSVBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    displayCSVBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dsproject.CSVDisplayGUIImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("displayCSV");
    }
  }

  private static final class displayCSVFileDescriptorSupplier
      extends displayCSVBaseDescriptorSupplier {
    displayCSVFileDescriptorSupplier() {}
  }

  private static final class displayCSVMethodDescriptorSupplier
      extends displayCSVBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    displayCSVMethodDescriptorSupplier(String methodName) {
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
      synchronized (displayCSVGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new displayCSVFileDescriptorSupplier())
              .addMethod(getDisplayMethod())
              .addMethod(getTerminateDisplayMethod())
              .build();
        }
      }
    }
    return result;
  }
}
