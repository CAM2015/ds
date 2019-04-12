package org.camelia.example.lego;

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
    comments = "Source: lego.proto")
public final class LegoServiceGrpc {

  private LegoServiceGrpc() {}

  public static final String SERVICE_NAME = "lego.LegoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.camelia.example.lego.LegoSet,
      org.camelia.example.lego.ConstructedLegoToy> getBuildLegoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "buildLego",
      requestType = org.camelia.example.lego.LegoSet.class,
      responseType = org.camelia.example.lego.ConstructedLegoToy.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.camelia.example.lego.LegoSet,
      org.camelia.example.lego.ConstructedLegoToy> getBuildLegoMethod() {
    io.grpc.MethodDescriptor<org.camelia.example.lego.LegoSet, org.camelia.example.lego.ConstructedLegoToy> getBuildLegoMethod;
    if ((getBuildLegoMethod = LegoServiceGrpc.getBuildLegoMethod) == null) {
      synchronized (LegoServiceGrpc.class) {
        if ((getBuildLegoMethod = LegoServiceGrpc.getBuildLegoMethod) == null) {
          LegoServiceGrpc.getBuildLegoMethod = getBuildLegoMethod = 
              io.grpc.MethodDescriptor.<org.camelia.example.lego.LegoSet, org.camelia.example.lego.ConstructedLegoToy>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lego.LegoService", "buildLego"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.camelia.example.lego.LegoSet.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.camelia.example.lego.ConstructedLegoToy.getDefaultInstance()))
                  .setSchemaDescriptor(new LegoServiceMethodDescriptorSupplier("buildLego"))
                  .build();
          }
        }
     }
     return getBuildLegoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.camelia.example.lego.LegoPieceRequest,
      org.camelia.example.lego.LegoPieceResponse> getLegoPieceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "legoPiece",
      requestType = org.camelia.example.lego.LegoPieceRequest.class,
      responseType = org.camelia.example.lego.LegoPieceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.camelia.example.lego.LegoPieceRequest,
      org.camelia.example.lego.LegoPieceResponse> getLegoPieceMethod() {
    io.grpc.MethodDescriptor<org.camelia.example.lego.LegoPieceRequest, org.camelia.example.lego.LegoPieceResponse> getLegoPieceMethod;
    if ((getLegoPieceMethod = LegoServiceGrpc.getLegoPieceMethod) == null) {
      synchronized (LegoServiceGrpc.class) {
        if ((getLegoPieceMethod = LegoServiceGrpc.getLegoPieceMethod) == null) {
          LegoServiceGrpc.getLegoPieceMethod = getLegoPieceMethod = 
              io.grpc.MethodDescriptor.<org.camelia.example.lego.LegoPieceRequest, org.camelia.example.lego.LegoPieceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "lego.LegoService", "legoPiece"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.camelia.example.lego.LegoPieceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.camelia.example.lego.LegoPieceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LegoServiceMethodDescriptorSupplier("legoPiece"))
                  .build();
          }
        }
     }
     return getLegoPieceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LegoServiceStub newStub(io.grpc.Channel channel) {
    return new LegoServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LegoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LegoServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LegoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LegoServiceFutureStub(channel);
  }

  /**
   * <pre>
   * The service definition.
   * </pre>
   */
  public static abstract class LegoServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void buildLego(org.camelia.example.lego.LegoSet request,
        io.grpc.stub.StreamObserver<org.camelia.example.lego.ConstructedLegoToy> responseObserver) {
      asyncUnimplementedUnaryCall(getBuildLegoMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.camelia.example.lego.LegoPieceRequest> legoPiece(
        io.grpc.stub.StreamObserver<org.camelia.example.lego.LegoPieceResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getLegoPieceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getBuildLegoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.camelia.example.lego.LegoSet,
                org.camelia.example.lego.ConstructedLegoToy>(
                  this, METHODID_BUILD_LEGO)))
          .addMethod(
            getLegoPieceMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                org.camelia.example.lego.LegoPieceRequest,
                org.camelia.example.lego.LegoPieceResponse>(
                  this, METHODID_LEGO_PIECE)))
          .build();
    }
  }

  /**
   * <pre>
   * The service definition.
   * </pre>
   */
  public static final class LegoServiceStub extends io.grpc.stub.AbstractStub<LegoServiceStub> {
    private LegoServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LegoServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LegoServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LegoServiceStub(channel, callOptions);
    }

    /**
     */
    public void buildLego(org.camelia.example.lego.LegoSet request,
        io.grpc.stub.StreamObserver<org.camelia.example.lego.ConstructedLegoToy> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBuildLegoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.camelia.example.lego.LegoPieceRequest> legoPiece(
        io.grpc.stub.StreamObserver<org.camelia.example.lego.LegoPieceResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getLegoPieceMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * The service definition.
   * </pre>
   */
  public static final class LegoServiceBlockingStub extends io.grpc.stub.AbstractStub<LegoServiceBlockingStub> {
    private LegoServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LegoServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LegoServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LegoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.camelia.example.lego.ConstructedLegoToy buildLego(org.camelia.example.lego.LegoSet request) {
      return blockingUnaryCall(
          getChannel(), getBuildLegoMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The service definition.
   * </pre>
   */
  public static final class LegoServiceFutureStub extends io.grpc.stub.AbstractStub<LegoServiceFutureStub> {
    private LegoServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LegoServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LegoServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LegoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.camelia.example.lego.ConstructedLegoToy> buildLego(
        org.camelia.example.lego.LegoSet request) {
      return futureUnaryCall(
          getChannel().newCall(getBuildLegoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BUILD_LEGO = 0;
  private static final int METHODID_LEGO_PIECE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LegoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LegoServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BUILD_LEGO:
          serviceImpl.buildLego((org.camelia.example.lego.LegoSet) request,
              (io.grpc.stub.StreamObserver<org.camelia.example.lego.ConstructedLegoToy>) responseObserver);
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
        case METHODID_LEGO_PIECE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.legoPiece(
              (io.grpc.stub.StreamObserver<org.camelia.example.lego.LegoPieceResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class LegoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LegoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.camelia.example.lego.LegoProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LegoService");
    }
  }

  private static final class LegoServiceFileDescriptorSupplier
      extends LegoServiceBaseDescriptorSupplier {
    LegoServiceFileDescriptorSupplier() {}
  }

  private static final class LegoServiceMethodDescriptorSupplier
      extends LegoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LegoServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LegoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LegoServiceFileDescriptorSupplier())
              .addMethod(getBuildLegoMethod())
              .addMethod(getLegoPieceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
