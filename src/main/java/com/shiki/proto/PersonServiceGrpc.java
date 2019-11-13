package com.shiki.proto;

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
    value = "by gRPC proto compiler (version 1.0.0-pre2)",
    comments = "Source: Person.proto")
public class PersonServiceGrpc {

  private PersonServiceGrpc() {}

  public static final String SERVICE_NAME = "com.shiki.proto.PersonService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<MyRequest,
      MyResponse> METHOD_GET_REAL_NAME_BY_USERNAME =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.shiki.proto.PersonService", "GetRealNameByUsername"),
          io.grpc.protobuf.ProtoUtils.marshaller(MyRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(MyResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<MyRequestStream,
      MyResponseStream> METHOD_GET_STUDENT_BY_AGE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "com.shiki.proto.PersonService", "GetStudentByAge"),
          io.grpc.protobuf.ProtoUtils.marshaller(MyRequestStream.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(MyResponseStream.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<MyRequest,
      MyResponseList> METHOD_GET_MY_RESPONSE_STREAM =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING,
          generateFullMethodName(
              "com.shiki.proto.PersonService", "GetMyResponseStream"),
          io.grpc.protobuf.ProtoUtils.marshaller(MyRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(MyResponseList.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<MyRequest,
      MyResponse> METHOD_BI_TALK =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING,
          generateFullMethodName(
              "com.shiki.proto.PersonService", "BiTalk"),
          io.grpc.protobuf.ProtoUtils.marshaller(MyRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(MyResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PersonServiceStub newStub(io.grpc.Channel channel) {
    return new PersonServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PersonServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PersonServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static PersonServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PersonServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class PersonServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getRealNameByUsername(MyRequest request,
                                      io.grpc.stub.StreamObserver<MyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_REAL_NAME_BY_USERNAME, responseObserver);
    }

    /**
     */
    public void getStudentByAge(MyRequestStream request,
                                io.grpc.stub.StreamObserver<MyResponseStream> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_STUDENT_BY_AGE, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<MyRequest> getMyResponseStream(
        io.grpc.stub.StreamObserver<MyResponseList> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_GET_MY_RESPONSE_STREAM, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<MyRequest> biTalk(
        io.grpc.stub.StreamObserver<MyResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_BI_TALK, responseObserver);
    }

    @Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_REAL_NAME_BY_USERNAME,
            asyncUnaryCall(
              new MethodHandlers<
                MyRequest,
                MyResponse>(
                  this, METHODID_GET_REAL_NAME_BY_USERNAME)))
          .addMethod(
            METHOD_GET_STUDENT_BY_AGE,
            asyncServerStreamingCall(
              new MethodHandlers<
                MyRequestStream,
                MyResponseStream>(
                  this, METHODID_GET_STUDENT_BY_AGE)))
          .addMethod(
            METHOD_GET_MY_RESPONSE_STREAM,
            asyncClientStreamingCall(
              new MethodHandlers<
                MyRequest,
                MyResponseList>(
                  this, METHODID_GET_MY_RESPONSE_STREAM)))
          .addMethod(
            METHOD_BI_TALK,
            asyncBidiStreamingCall(
              new MethodHandlers<
                MyRequest,
                MyResponse>(
                  this, METHODID_BI_TALK)))
          .build();
    }
  }

  /**
   */
  public static final class PersonServiceStub extends io.grpc.stub.AbstractStub<PersonServiceStub> {
    private PersonServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersonServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected PersonServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonServiceStub(channel, callOptions);
    }

    /**
     */
    public void getRealNameByUsername(MyRequest request,
                                      io.grpc.stub.StreamObserver<MyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_REAL_NAME_BY_USERNAME, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStudentByAge(MyRequestStream request,
                                io.grpc.stub.StreamObserver<MyResponseStream> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_GET_STUDENT_BY_AGE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<MyRequest> getMyResponseStream(
        io.grpc.stub.StreamObserver<MyResponseList> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_GET_MY_RESPONSE_STREAM, getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<MyRequest> biTalk(
        io.grpc.stub.StreamObserver<MyResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(METHOD_BI_TALK, getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class PersonServiceBlockingStub extends io.grpc.stub.AbstractStub<PersonServiceBlockingStub> {
    private PersonServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersonServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected PersonServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public MyResponse getRealNameByUsername(MyRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_REAL_NAME_BY_USERNAME, getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<MyResponseStream> getStudentByAge(
        MyRequestStream request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_GET_STUDENT_BY_AGE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PersonServiceFutureStub extends io.grpc.stub.AbstractStub<PersonServiceFutureStub> {
    private PersonServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersonServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected PersonServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<MyResponse> getRealNameByUsername(
        MyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_REAL_NAME_BY_USERNAME, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_REAL_NAME_BY_USERNAME = 0;
  private static final int METHODID_GET_STUDENT_BY_AGE = 1;
  private static final int METHODID_GET_MY_RESPONSE_STREAM = 2;
  private static final int METHODID_BI_TALK = 3;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PersonServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(PersonServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_REAL_NAME_BY_USERNAME:
          serviceImpl.getRealNameByUsername((MyRequest) request,
              (io.grpc.stub.StreamObserver<MyResponse>) responseObserver);
          break;
        case METHODID_GET_STUDENT_BY_AGE:
          serviceImpl.getStudentByAge((MyRequestStream) request,
              (io.grpc.stub.StreamObserver<MyResponseStream>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_MY_RESPONSE_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getMyResponseStream(
              (io.grpc.stub.StreamObserver<MyResponseList>) responseObserver);
        case METHODID_BI_TALK:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.biTalk(
              (io.grpc.stub.StreamObserver<MyResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_GET_REAL_NAME_BY_USERNAME,
        METHOD_GET_STUDENT_BY_AGE,
        METHOD_GET_MY_RESPONSE_STREAM,
        METHOD_BI_TALK);
  }

}
