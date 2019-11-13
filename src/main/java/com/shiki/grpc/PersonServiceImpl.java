package com.shiki.grpc;

import com.shiki.proto.*;
import io.grpc.ServerServiceDefinition;
import io.grpc.stub.StreamObserver;

/**
 * @author: shiki
 * @date: 2019/11/13 上午11:12
 * @description:
 */
public class PersonServiceImpl extends PersonServiceGrpc.PersonServiceImplBase {
    @Override
    public void getRealNameByUsername(MyRequest request, StreamObserver<MyResponse> responseObserver) {
        System.out.println(request.getUsername());
        responseObserver.onNext(MyResponse.newBuilder().setRealname(request.getUsername()).build());
        responseObserver.onCompleted();
    }

    @Override
    public void getStudentByAge(MyRequestStream request, StreamObserver<MyResponseStream> responseObserver) {
        System.out.println("client message" + request.getAge());
        responseObserver.onNext(MyResponseStream.newBuilder().setAge(18).setUsername("shiki").setCity("萧山").build());
        responseObserver.onNext(MyResponseStream.newBuilder().setAge(19).setUsername("shiki").setCity("萧山").build());
        responseObserver.onNext(MyResponseStream.newBuilder().setAge(20).setUsername("shiki").setCity("萧山").build());
        responseObserver.onNext(MyResponseStream.newBuilder().setAge(21).setUsername("shiki").setCity("萧山").build());
        responseObserver.onCompleted();
    }


    /**
     * 由于该接口的返回不是流式，如果在StreamObserver<MyRequest>()的onNext()方法去写返回的话会报警告：
     * 警告: Cancelling the stream with status Status{code=INTERNAL, description=Too many responses, cause=null}
     * 因此这种情况只能在客户端的请求流结束onCompleted()方法中去进行响应返回
     *
     * @param responseObserver
     * @return
     */
    @Override
    public StreamObserver<MyRequest> getMyResponseStream(StreamObserver<MyResponseList> responseObserver) {
        return new StreamObserver<MyRequest>() {
            @Override
            public void onNext(MyRequest myRequest) {
                System.out.println(myRequest.getUsername());
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println(throwable.getMessage());
            }

            @Override
            public void onCompleted() {
//                如果不向onNext中放入数据也会报错
                responseObserver.onNext(MyResponseList.newBuilder()
                        .addMyRequestStream(MyRequestStream.newBuilder().setAge(18).build())
                        .addMyRequestStream(MyRequestStream.newBuilder().setAge(19).build())
                        .build());
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<MyRequest> biTalk(StreamObserver<MyResponse> responseObserver) {
        return new StreamObserver<MyRequest>() {
            @Override
            public void onNext(MyRequest myRequest) {
                System.out.println(myRequest.getUsername());
                responseObserver.onNext(MyResponse.newBuilder().setRealname("shiki" + myRequest.getUsername()).build());
            }

            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }
}