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

public final class PollutantGUIGrpc {

  private PollutantGUIGrpc() {}

  public static final String SERVICE_NAME = "PollutantGUI";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dsproject.displayGUIRequest,
      com.dsproject.displayGUIResponse> getDisplayGUIMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "displayGUI",
      requestType = com.dsproject.displayGUIRequest.class,
      responseType = com.dsproject.displayGUIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dsproject.displayGUIRequest,
      com.dsproject.displayGUIResponse> getDisplayGUIMethod() {
    io.grpc.MethodDescriptor<com.dsproject.displayGUIRequest, com.dsproject.displayGUIResponse> getDisplayGUIMethod;
    if ((getDisplayGUIMethod = PollutantGUIGrpc.getDisplayGUIMethod) == null) {
      synchronized (PollutantGUIGrpc.class) {
        if ((getDisplayGUIMethod = PollutantGUIGrpc.getDisplayGUIMethod) == null) {
          PollutantGUIGrpc.getDisplayGUIMethod = getDisplayGUIMethod = 
              io.grpc.MethodDescriptor.<com.dsproject.displayGUIRequest, com.dsproject.displayGUIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PollutantGUI", "displayGUI"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dsproject.displayGUIRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dsproject.displayGUIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PollutantGUIMethodDescriptorSupplier("displayGUI"))
                  .build();
          }
        }
     }
     return getDisplayGUIMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dsproject.terminateGUIRequest,
      com.dsproject.terminateGUIResponse> getTerminateGUIMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "terminateGUI",
      requestType = com.dsproject.terminateGUIRequest.class,
      responseType = com.dsproject.terminateGUIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dsproject.terminateGUIRequest,
      com.dsproject.terminateGUIResponse> getTerminateGUIMethod() {
    io.grpc.MethodDescriptor<com.dsproject.terminateGUIRequest, com.dsproject.terminateGUIResponse> getTerminateGUIMethod;
    if ((getTerminateGUIMethod = PollutantGUIGrpc.getTerminateGUIMethod) == null) {
      synchronized (PollutantGUIGrpc.class) {
        if ((getTerminateGUIMethod = PollutantGUIGrpc.getTerminateGUIMethod) == null) {
          PollutantGUIGrpc.getTerminateGUIMethod = getTerminateGUIMethod = 
              io.grpc.MethodDescriptor.<com.dsproject.terminateGUIRequest, com.dsproject.terminateGUIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PollutantGUI", "terminateGUI"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dsproject.terminateGUIRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dsproject.terminateGUIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PollutantGUIMethodDescriptorSupplier("terminateGUI"))
                  .build();
          }
        }
     }
     return getTerminateGUIMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PollutantGUIStub newStub(io.grpc.Channel channel) {
    return new PollutantGUIStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PollutantGUIBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PollutantGUIBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PollutantGUIFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PollutantGUIFutureStub(channel);
  }

  /**
   */
  public static abstract class PollutantGUIImplBase implements io.grpc.BindableService {

    /**
     */
    public void displayGUI(com.dsproject.displayGUIRequest request,
        io.grpc.stub.StreamObserver<com.dsproject.displayGUIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDisplayGUIMethod(), responseObserver);
    }

    /**
     */
    public void terminateGUI(com.dsproject.terminateGUIRequest request,
        io.grpc.stub.StreamObserver<com.dsproject.terminateGUIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTerminateGUIMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDisplayGUIMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.dsproject.displayGUIRequest,
                com.dsproject.displayGUIResponse>(
                  this, METHODID_DISPLAY_GUI)))
          .addMethod(
            getTerminateGUIMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.dsproject.terminateGUIRequest,
                com.dsproject.terminateGUIResponse>(
                  this, METHODID_TERMINATE_GUI)))
          .build();
    }
  }

  /**
   */
  public static final class PollutantGUIStub extends io.grpc.stub.AbstractStub<PollutantGUIStub> {
    private PollutantGUIStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PollutantGUIStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PollutantGUIStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PollutantGUIStub(channel, callOptions);
    }

    /**
     */
    public void displayGUI(com.dsproject.displayGUIRequest request,
        io.grpc.stub.StreamObserver<com.dsproject.displayGUIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDisplayGUIMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void terminateGUI(com.dsproject.terminateGUIRequest request,
        io.grpc.stub.StreamObserver<com.dsproject.terminateGUIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTerminateGUIMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PollutantGUIBlockingStub extends io.grpc.stub.AbstractStub<PollutantGUIBlockingStub> {
    private PollutantGUIBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PollutantGUIBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PollutantGUIBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PollutantGUIBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.dsproject.displayGUIResponse displayGUI(com.dsproject.displayGUIRequest request) {
      return blockingUnaryCall(
          getChannel(), getDisplayGUIMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dsproject.terminateGUIResponse terminateGUI(com.dsproject.terminateGUIRequest request) {
      return blockingUnaryCall(
          getChannel(), getTerminateGUIMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PollutantGUIFutureStub extends io.grpc.stub.AbstractStub<PollutantGUIFutureStub> {
    private PollutantGUIFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PollutantGUIFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PollutantGUIFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PollutantGUIFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dsproject.displayGUIResponse> displayGUI(
        com.dsproject.displayGUIRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDisplayGUIMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dsproject.terminateGUIResponse> terminateGUI(
        com.dsproject.terminateGUIRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTerminateGUIMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DISPLAY_GUI = 0;
  private static final int METHODID_TERMINATE_GUI = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PollutantGUIImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PollutantGUIImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DISPLAY_GUI:
          serviceImpl.displayGUI((com.dsproject.displayGUIRequest) request,
              (io.grpc.stub.StreamObserver<com.dsproject.displayGUIResponse>) responseObserver);
          break;
        case METHODID_TERMINATE_GUI:
          serviceImpl.terminateGUI((com.dsproject.terminateGUIRequest) request,
              (io.grpc.stub.StreamObserver<com.dsproject.terminateGUIResponse>) responseObserver);
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

  private static abstract class PollutantGUIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PollutantGUIBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dsproject.PollutantGUIImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PollutantGUI");
    }
  }

  private static final class PollutantGUIFileDescriptorSupplier
      extends PollutantGUIBaseDescriptorSupplier {
    PollutantGUIFileDescriptorSupplier() {}
  }

  private static final class PollutantGUIMethodDescriptorSupplier
      extends PollutantGUIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PollutantGUIMethodDescriptorSupplier(String methodName) {
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
      synchronized (PollutantGUIGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PollutantGUIFileDescriptorSupplier())
              .addMethod(getDisplayGUIMethod())
              .addMethod(getTerminateGUIMethod())
              .build();
        }
      }
    }
    return result;
  }
}
