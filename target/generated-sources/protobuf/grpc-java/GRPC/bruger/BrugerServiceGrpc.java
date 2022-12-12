package GRPC.bruger;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: BrugerService.proto")
public final class BrugerServiceGrpc {

  private BrugerServiceGrpc() {}

  public static final String SERVICE_NAME = "GRPC.bruger.BrugerService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<GRPC.bruger.Bruger,
      GRPC.bruger.BrugerResponse> METHOD_CREATE_BRUGER =
      io.grpc.MethodDescriptor.<GRPC.bruger.Bruger, GRPC.bruger.BrugerResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "GRPC.bruger.BrugerService", "createBruger"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              GRPC.bruger.Bruger.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              GRPC.bruger.BrugerResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<GRPC.bruger.BrugerRequest,
      GRPC.bruger.Bruger> METHOD_GET_BRUGER =
      io.grpc.MethodDescriptor.<GRPC.bruger.BrugerRequest, GRPC.bruger.Bruger>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "GRPC.bruger.BrugerService", "getBruger"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              GRPC.bruger.BrugerRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              GRPC.bruger.Bruger.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<GRPC.bruger.AktieRequest,
      GRPC.bruger.AktieResponse> METHOD_HANDLE_AKTIE =
      io.grpc.MethodDescriptor.<GRPC.bruger.AktieRequest, GRPC.bruger.AktieResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "GRPC.bruger.BrugerService", "handleAktie"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              GRPC.bruger.AktieRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              GRPC.bruger.AktieResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<GRPC.bruger.BrugerRequest,
      GRPC.bruger.BrugerResponse> METHOD_LOGIN_BRUGER =
      io.grpc.MethodDescriptor.<GRPC.bruger.BrugerRequest, GRPC.bruger.BrugerResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "GRPC.bruger.BrugerService", "loginBruger"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              GRPC.bruger.BrugerRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              GRPC.bruger.BrugerResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<GRPC.bruger.AktieName,
      GRPC.bruger.Aktie> METHOD_GET_AKTIE =
      io.grpc.MethodDescriptor.<GRPC.bruger.AktieName, GRPC.bruger.Aktie>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "GRPC.bruger.BrugerService", "getAktie"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              GRPC.bruger.AktieName.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              GRPC.bruger.Aktie.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<GRPC.bruger.getAllAktier,
      GRPC.bruger.allAktier> METHOD_GET_ALL =
      io.grpc.MethodDescriptor.<GRPC.bruger.getAllAktier, GRPC.bruger.allAktier>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "GRPC.bruger.BrugerService", "getAll"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              GRPC.bruger.getAllAktier.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              GRPC.bruger.allAktier.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<GRPC.bruger.BrugerRequest,
      GRPC.bruger.BrugerResponse> METHOD_HANDLE_BRUGER =
      io.grpc.MethodDescriptor.<GRPC.bruger.BrugerRequest, GRPC.bruger.BrugerResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "GRPC.bruger.BrugerService", "handleBruger"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              GRPC.bruger.BrugerRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              GRPC.bruger.BrugerResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<GRPC.bruger.getDepotFraID,
      GRPC.bruger.DepotResponse> METHOD_GET_ALL_DEPOTER =
      io.grpc.MethodDescriptor.<GRPC.bruger.getDepotFraID, GRPC.bruger.DepotResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "GRPC.bruger.BrugerService", "getAllDepoter"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              GRPC.bruger.getDepotFraID.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              GRPC.bruger.DepotResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BrugerServiceStub newStub(io.grpc.Channel channel) {
    return new BrugerServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BrugerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BrugerServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BrugerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BrugerServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BrugerServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createBruger(GRPC.bruger.Bruger request,
        io.grpc.stub.StreamObserver<GRPC.bruger.BrugerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_BRUGER, responseObserver);
    }

    /**
     */
    public void getBruger(GRPC.bruger.BrugerRequest request,
        io.grpc.stub.StreamObserver<GRPC.bruger.Bruger> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_BRUGER, responseObserver);
    }

    /**
     */
    public void handleAktie(GRPC.bruger.AktieRequest request,
        io.grpc.stub.StreamObserver<GRPC.bruger.AktieResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_HANDLE_AKTIE, responseObserver);
    }

    /**
     */
    public void loginBruger(GRPC.bruger.BrugerRequest request,
        io.grpc.stub.StreamObserver<GRPC.bruger.BrugerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LOGIN_BRUGER, responseObserver);
    }

    /**
     */
    public void getAktie(GRPC.bruger.AktieName request,
        io.grpc.stub.StreamObserver<GRPC.bruger.Aktie> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_AKTIE, responseObserver);
    }

    /**
     */
    public void getAll(GRPC.bruger.getAllAktier request,
        io.grpc.stub.StreamObserver<GRPC.bruger.allAktier> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ALL, responseObserver);
    }

    /**
     */
    public void handleBruger(GRPC.bruger.BrugerRequest request,
        io.grpc.stub.StreamObserver<GRPC.bruger.BrugerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_HANDLE_BRUGER, responseObserver);
    }

    /**
     */
    public void getAllDepoter(GRPC.bruger.getDepotFraID request,
        io.grpc.stub.StreamObserver<GRPC.bruger.DepotResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ALL_DEPOTER, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE_BRUGER,
            asyncUnaryCall(
              new MethodHandlers<
                GRPC.bruger.Bruger,
                GRPC.bruger.BrugerResponse>(
                  this, METHODID_CREATE_BRUGER)))
          .addMethod(
            METHOD_GET_BRUGER,
            asyncUnaryCall(
              new MethodHandlers<
                GRPC.bruger.BrugerRequest,
                GRPC.bruger.Bruger>(
                  this, METHODID_GET_BRUGER)))
          .addMethod(
            METHOD_HANDLE_AKTIE,
            asyncUnaryCall(
              new MethodHandlers<
                GRPC.bruger.AktieRequest,
                GRPC.bruger.AktieResponse>(
                  this, METHODID_HANDLE_AKTIE)))
          .addMethod(
            METHOD_LOGIN_BRUGER,
            asyncUnaryCall(
              new MethodHandlers<
                GRPC.bruger.BrugerRequest,
                GRPC.bruger.BrugerResponse>(
                  this, METHODID_LOGIN_BRUGER)))
          .addMethod(
            METHOD_GET_AKTIE,
            asyncUnaryCall(
              new MethodHandlers<
                GRPC.bruger.AktieName,
                GRPC.bruger.Aktie>(
                  this, METHODID_GET_AKTIE)))
          .addMethod(
            METHOD_GET_ALL,
            asyncUnaryCall(
              new MethodHandlers<
                GRPC.bruger.getAllAktier,
                GRPC.bruger.allAktier>(
                  this, METHODID_GET_ALL)))
          .addMethod(
            METHOD_HANDLE_BRUGER,
            asyncUnaryCall(
              new MethodHandlers<
                GRPC.bruger.BrugerRequest,
                GRPC.bruger.BrugerResponse>(
                  this, METHODID_HANDLE_BRUGER)))
          .addMethod(
            METHOD_GET_ALL_DEPOTER,
            asyncUnaryCall(
              new MethodHandlers<
                GRPC.bruger.getDepotFraID,
                GRPC.bruger.DepotResponse>(
                  this, METHODID_GET_ALL_DEPOTER)))
          .build();
    }
  }

  /**
   */
  public static final class BrugerServiceStub extends io.grpc.stub.AbstractStub<BrugerServiceStub> {
    private BrugerServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BrugerServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BrugerServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BrugerServiceStub(channel, callOptions);
    }

    /**
     */
    public void createBruger(GRPC.bruger.Bruger request,
        io.grpc.stub.StreamObserver<GRPC.bruger.BrugerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_BRUGER, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBruger(GRPC.bruger.BrugerRequest request,
        io.grpc.stub.StreamObserver<GRPC.bruger.Bruger> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_BRUGER, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void handleAktie(GRPC.bruger.AktieRequest request,
        io.grpc.stub.StreamObserver<GRPC.bruger.AktieResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_HANDLE_AKTIE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void loginBruger(GRPC.bruger.BrugerRequest request,
        io.grpc.stub.StreamObserver<GRPC.bruger.BrugerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LOGIN_BRUGER, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAktie(GRPC.bruger.AktieName request,
        io.grpc.stub.StreamObserver<GRPC.bruger.Aktie> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_AKTIE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAll(GRPC.bruger.getAllAktier request,
        io.grpc.stub.StreamObserver<GRPC.bruger.allAktier> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ALL, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void handleBruger(GRPC.bruger.BrugerRequest request,
        io.grpc.stub.StreamObserver<GRPC.bruger.BrugerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_HANDLE_BRUGER, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllDepoter(GRPC.bruger.getDepotFraID request,
        io.grpc.stub.StreamObserver<GRPC.bruger.DepotResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_DEPOTER, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BrugerServiceBlockingStub extends io.grpc.stub.AbstractStub<BrugerServiceBlockingStub> {
    private BrugerServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BrugerServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BrugerServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BrugerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public GRPC.bruger.BrugerResponse createBruger(GRPC.bruger.Bruger request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_BRUGER, getCallOptions(), request);
    }

    /**
     */
    public GRPC.bruger.Bruger getBruger(GRPC.bruger.BrugerRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_BRUGER, getCallOptions(), request);
    }

    /**
     */
    public GRPC.bruger.AktieResponse handleAktie(GRPC.bruger.AktieRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_HANDLE_AKTIE, getCallOptions(), request);
    }

    /**
     */
    public GRPC.bruger.BrugerResponse loginBruger(GRPC.bruger.BrugerRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LOGIN_BRUGER, getCallOptions(), request);
    }

    /**
     */
    public GRPC.bruger.Aktie getAktie(GRPC.bruger.AktieName request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_AKTIE, getCallOptions(), request);
    }

    /**
     */
    public GRPC.bruger.allAktier getAll(GRPC.bruger.getAllAktier request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ALL, getCallOptions(), request);
    }

    /**
     */
    public GRPC.bruger.BrugerResponse handleBruger(GRPC.bruger.BrugerRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_HANDLE_BRUGER, getCallOptions(), request);
    }

    /**
     */
    public GRPC.bruger.DepotResponse getAllDepoter(GRPC.bruger.getDepotFraID request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ALL_DEPOTER, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BrugerServiceFutureStub extends io.grpc.stub.AbstractStub<BrugerServiceFutureStub> {
    private BrugerServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BrugerServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BrugerServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BrugerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GRPC.bruger.BrugerResponse> createBruger(
        GRPC.bruger.Bruger request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_BRUGER, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GRPC.bruger.Bruger> getBruger(
        GRPC.bruger.BrugerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_BRUGER, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GRPC.bruger.AktieResponse> handleAktie(
        GRPC.bruger.AktieRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_HANDLE_AKTIE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GRPC.bruger.BrugerResponse> loginBruger(
        GRPC.bruger.BrugerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LOGIN_BRUGER, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GRPC.bruger.Aktie> getAktie(
        GRPC.bruger.AktieName request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_AKTIE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GRPC.bruger.allAktier> getAll(
        GRPC.bruger.getAllAktier request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ALL, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GRPC.bruger.BrugerResponse> handleBruger(
        GRPC.bruger.BrugerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_HANDLE_BRUGER, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GRPC.bruger.DepotResponse> getAllDepoter(
        GRPC.bruger.getDepotFraID request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_DEPOTER, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_BRUGER = 0;
  private static final int METHODID_GET_BRUGER = 1;
  private static final int METHODID_HANDLE_AKTIE = 2;
  private static final int METHODID_LOGIN_BRUGER = 3;
  private static final int METHODID_GET_AKTIE = 4;
  private static final int METHODID_GET_ALL = 5;
  private static final int METHODID_HANDLE_BRUGER = 6;
  private static final int METHODID_GET_ALL_DEPOTER = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BrugerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BrugerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_BRUGER:
          serviceImpl.createBruger((GRPC.bruger.Bruger) request,
              (io.grpc.stub.StreamObserver<GRPC.bruger.BrugerResponse>) responseObserver);
          break;
        case METHODID_GET_BRUGER:
          serviceImpl.getBruger((GRPC.bruger.BrugerRequest) request,
              (io.grpc.stub.StreamObserver<GRPC.bruger.Bruger>) responseObserver);
          break;
        case METHODID_HANDLE_AKTIE:
          serviceImpl.handleAktie((GRPC.bruger.AktieRequest) request,
              (io.grpc.stub.StreamObserver<GRPC.bruger.AktieResponse>) responseObserver);
          break;
        case METHODID_LOGIN_BRUGER:
          serviceImpl.loginBruger((GRPC.bruger.BrugerRequest) request,
              (io.grpc.stub.StreamObserver<GRPC.bruger.BrugerResponse>) responseObserver);
          break;
        case METHODID_GET_AKTIE:
          serviceImpl.getAktie((GRPC.bruger.AktieName) request,
              (io.grpc.stub.StreamObserver<GRPC.bruger.Aktie>) responseObserver);
          break;
        case METHODID_GET_ALL:
          serviceImpl.getAll((GRPC.bruger.getAllAktier) request,
              (io.grpc.stub.StreamObserver<GRPC.bruger.allAktier>) responseObserver);
          break;
        case METHODID_HANDLE_BRUGER:
          serviceImpl.handleBruger((GRPC.bruger.BrugerRequest) request,
              (io.grpc.stub.StreamObserver<GRPC.bruger.BrugerResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_DEPOTER:
          serviceImpl.getAllDepoter((GRPC.bruger.getDepotFraID) request,
              (io.grpc.stub.StreamObserver<GRPC.bruger.DepotResponse>) responseObserver);
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

  private static final class BrugerServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return GRPC.bruger.BrugerServiceOuterClass.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (BrugerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BrugerServiceDescriptorSupplier())
              .addMethod(METHOD_CREATE_BRUGER)
              .addMethod(METHOD_GET_BRUGER)
              .addMethod(METHOD_HANDLE_AKTIE)
              .addMethod(METHOD_LOGIN_BRUGER)
              .addMethod(METHOD_GET_AKTIE)
              .addMethod(METHOD_GET_ALL)
              .addMethod(METHOD_HANDLE_BRUGER)
              .addMethod(METHOD_GET_ALL_DEPOTER)
              .build();
        }
      }
    }
    return result;
  }
}
