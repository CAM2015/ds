package org.camelia.example.ipad;

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
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: ipad.proto")
public final class IPadServiceGrpc {

  private IPadServiceGrpc() {}

  public static final String SERVICE_NAME = "ipad.IPadService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.camelia.example.ipad.ArtistId,
      org.camelia.example.ipad.SongList> getAllSongsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllSongs",
      requestType = org.camelia.example.ipad.ArtistId.class,
      responseType = org.camelia.example.ipad.SongList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.camelia.example.ipad.ArtistId,
      org.camelia.example.ipad.SongList> getAllSongsMethod() {
    io.grpc.MethodDescriptor<org.camelia.example.ipad.ArtistId, org.camelia.example.ipad.SongList> getAllSongsMethod;
    if ((getAllSongsMethod = IPadServiceGrpc.getAllSongsMethod) == null) {
      synchronized (IPadServiceGrpc.class) {
        if ((getAllSongsMethod = IPadServiceGrpc.getAllSongsMethod) == null) {
          IPadServiceGrpc.getAllSongsMethod = getAllSongsMethod = 
              io.grpc.MethodDescriptor.<org.camelia.example.ipad.ArtistId, org.camelia.example.ipad.SongList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ipad.IPadService", "AllSongs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.camelia.example.ipad.ArtistId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.camelia.example.ipad.SongList.getDefaultInstance()))
                  .setSchemaDescriptor(new IPadServiceMethodDescriptorSupplier("AllSongs"))
                  .build();
          }
        }
     }
     return getAllSongsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.camelia.example.ipad.AllArtists> getGetArtistsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetArtists",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.camelia.example.ipad.AllArtists.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.camelia.example.ipad.AllArtists> getGetArtistsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.camelia.example.ipad.AllArtists> getGetArtistsMethod;
    if ((getGetArtistsMethod = IPadServiceGrpc.getGetArtistsMethod) == null) {
      synchronized (IPadServiceGrpc.class) {
        if ((getGetArtistsMethod = IPadServiceGrpc.getGetArtistsMethod) == null) {
          IPadServiceGrpc.getGetArtistsMethod = getGetArtistsMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.camelia.example.ipad.AllArtists>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ipad.IPadService", "GetArtists"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.camelia.example.ipad.AllArtists.getDefaultInstance()))
                  .setSchemaDescriptor(new IPadServiceMethodDescriptorSupplier("GetArtists"))
                  .build();
          }
        }
     }
     return getGetArtistsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IPadServiceStub newStub(io.grpc.Channel channel) {
    return new IPadServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IPadServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new IPadServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IPadServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new IPadServiceFutureStub(channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class IPadServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void allSongs(org.camelia.example.ipad.ArtistId request,
        io.grpc.stub.StreamObserver<org.camelia.example.ipad.SongList> responseObserver) {
      asyncUnimplementedUnaryCall(getAllSongsMethod(), responseObserver);
    }

    /**
     */
    public void getArtists(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.camelia.example.ipad.AllArtists> responseObserver) {
      asyncUnimplementedUnaryCall(getGetArtistsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAllSongsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.camelia.example.ipad.ArtistId,
                org.camelia.example.ipad.SongList>(
                  this, METHODID_ALL_SONGS)))
          .addMethod(
            getGetArtistsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.camelia.example.ipad.AllArtists>(
                  this, METHODID_GET_ARTISTS)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class IPadServiceStub extends io.grpc.stub.AbstractStub<IPadServiceStub> {
    private IPadServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IPadServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IPadServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IPadServiceStub(channel, callOptions);
    }

    /**
     */
    public void allSongs(org.camelia.example.ipad.ArtistId request,
        io.grpc.stub.StreamObserver<org.camelia.example.ipad.SongList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAllSongsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getArtists(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.camelia.example.ipad.AllArtists> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetArtistsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class IPadServiceBlockingStub extends io.grpc.stub.AbstractStub<IPadServiceBlockingStub> {
    private IPadServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IPadServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IPadServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IPadServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.camelia.example.ipad.SongList allSongs(org.camelia.example.ipad.ArtistId request) {
      return blockingUnaryCall(
          getChannel(), getAllSongsMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.camelia.example.ipad.AllArtists> getArtists(
        com.google.protobuf.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getGetArtistsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class IPadServiceFutureStub extends io.grpc.stub.AbstractStub<IPadServiceFutureStub> {
    private IPadServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IPadServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IPadServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IPadServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.camelia.example.ipad.SongList> allSongs(
        org.camelia.example.ipad.ArtistId request) {
      return futureUnaryCall(
          getChannel().newCall(getAllSongsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ALL_SONGS = 0;
  private static final int METHODID_GET_ARTISTS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IPadServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IPadServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ALL_SONGS:
          serviceImpl.allSongs((org.camelia.example.ipad.ArtistId) request,
              (io.grpc.stub.StreamObserver<org.camelia.example.ipad.SongList>) responseObserver);
          break;
        case METHODID_GET_ARTISTS:
          serviceImpl.getArtists((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.camelia.example.ipad.AllArtists>) responseObserver);
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

  private static abstract class IPadServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IPadServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.camelia.example.ipad.IPadProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IPadService");
    }
  }

  private static final class IPadServiceFileDescriptorSupplier
      extends IPadServiceBaseDescriptorSupplier {
    IPadServiceFileDescriptorSupplier() {}
  }

  private static final class IPadServiceMethodDescriptorSupplier
      extends IPadServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    IPadServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (IPadServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IPadServiceFileDescriptorSupplier())
              .addMethod(getAllSongsMethod())
              .addMethod(getGetArtistsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
