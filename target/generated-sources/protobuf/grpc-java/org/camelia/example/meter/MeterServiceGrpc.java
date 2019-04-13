package org.camelia.example.meter;

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
 * The service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: meter.proto")
public final class MeterServiceGrpc {

  private MeterServiceGrpc() {}

  public static final String SERVICE_NAME = "meter.MeterService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.camelia.example.meter.FundsAdded,
      org.camelia.example.meter.FundsAddedConfirmation> getFundsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Funds",
      requestType = org.camelia.example.meter.FundsAdded.class,
      responseType = org.camelia.example.meter.FundsAddedConfirmation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.camelia.example.meter.FundsAdded,
      org.camelia.example.meter.FundsAddedConfirmation> getFundsMethod() {
    io.grpc.MethodDescriptor<org.camelia.example.meter.FundsAdded, org.camelia.example.meter.FundsAddedConfirmation> getFundsMethod;
    if ((getFundsMethod = MeterServiceGrpc.getFundsMethod) == null) {
      synchronized (MeterServiceGrpc.class) {
        if ((getFundsMethod = MeterServiceGrpc.getFundsMethod) == null) {
          MeterServiceGrpc.getFundsMethod = getFundsMethod = 
              io.grpc.MethodDescriptor.<org.camelia.example.meter.FundsAdded, org.camelia.example.meter.FundsAddedConfirmation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "meter.MeterService", "Funds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.camelia.example.meter.FundsAdded.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.camelia.example.meter.FundsAddedConfirmation.getDefaultInstance()))
                  .setSchemaDescriptor(new MeterServiceMethodDescriptorSupplier("Funds"))
                  .build();
          }
        }
     }
     return getFundsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MeterServiceStub newStub(io.grpc.Channel channel) {
    return new MeterServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MeterServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MeterServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MeterServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MeterServiceFutureStub(channel);
  }

  /**
   * <pre>
   * The service definition.
   * </pre>
   */
  public static abstract class MeterServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void funds(org.camelia.example.meter.FundsAdded request,
        io.grpc.stub.StreamObserver<org.camelia.example.meter.FundsAddedConfirmation> responseObserver) {
      asyncUnimplementedUnaryCall(getFundsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFundsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.camelia.example.meter.FundsAdded,
                org.camelia.example.meter.FundsAddedConfirmation>(
                  this, METHODID_FUNDS)))
          .build();
    }
  }

  /**
   * <pre>
   * The service definition.
   * </pre>
   */
  public static final class MeterServiceStub extends io.grpc.stub.AbstractStub<MeterServiceStub> {
    private MeterServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MeterServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MeterServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MeterServiceStub(channel, callOptions);
    }

    /**
     */
    public void funds(org.camelia.example.meter.FundsAdded request,
        io.grpc.stub.StreamObserver<org.camelia.example.meter.FundsAddedConfirmation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFundsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The service definition.
   * </pre>
   */
  public static final class MeterServiceBlockingStub extends io.grpc.stub.AbstractStub<MeterServiceBlockingStub> {
    private MeterServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MeterServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MeterServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MeterServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.camelia.example.meter.FundsAddedConfirmation funds(org.camelia.example.meter.FundsAdded request) {
      return blockingUnaryCall(
          getChannel(), getFundsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The service definition.
   * </pre>
   */
  public static final class MeterServiceFutureStub extends io.grpc.stub.AbstractStub<MeterServiceFutureStub> {
    private MeterServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MeterServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MeterServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MeterServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.camelia.example.meter.FundsAddedConfirmation> funds(
        org.camelia.example.meter.FundsAdded request) {
      return futureUnaryCall(
          getChannel().newCall(getFundsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FUNDS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MeterServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MeterServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FUNDS:
          serviceImpl.funds((org.camelia.example.meter.FundsAdded) request,
              (io.grpc.stub.StreamObserver<org.camelia.example.meter.FundsAddedConfirmation>) responseObserver);
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

  private static abstract class MeterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MeterServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.camelia.example.meter.MeterProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MeterService");
    }
  }

  private static final class MeterServiceFileDescriptorSupplier
      extends MeterServiceBaseDescriptorSupplier {
    MeterServiceFileDescriptorSupplier() {}
  }

  private static final class MeterServiceMethodDescriptorSupplier
      extends MeterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MeterServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MeterServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MeterServiceFileDescriptorSupplier())
              .addMethod(getFundsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
