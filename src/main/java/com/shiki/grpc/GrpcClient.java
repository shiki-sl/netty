package com.shiki.grpc;

import com.shiki.proto.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.TimeUnit;

/**
 * @author: shiki
 * @date: 2019/11/13 下午12:00
 * @description:
 */
public class GrpcClient {
    public static void main(String[] args) throws InterruptedException {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 8899)
                .usePlaintext().build();
        PersonServiceGrpc.PersonServiceBlockingStub blockingStub = PersonServiceGrpc.newBlockingStub(managedChannel);
        PersonServiceGrpc.PersonServiceStub stub = PersonServiceGrpc.newStub(managedChannel);
////      双向非流式
//        MyResponse myResponse = blockingStub.getRealNameByUsername(MyRequest.newBuilder().setUsername("shiki").build());
//        blockingStub.getRealNameByUsername(MyRequest.newBuilder().setUsername("shiki").build());
//        blockingStub.getRealNameByUsername(MyRequest.newBuilder().setUsername("shiki").build());
//        blockingStub.getRealNameByUsername(MyRequest.newBuilder().setUsername("shiki").build());
//        blockingStub.getRealNameByUsername(MyRequest.newBuilder().setUsername("shiki").build());
//        blockingStub.getRealNameByUsername(MyRequest.newBuilder().setUsername("shiki").build());
//        blockingStub.getRealNameByUsername(MyRequest.newBuilder().setUsername("shiki").build());
//        System.out.println(myResponse);

////        响应流
//        blockingStub.getStudentByAge(MyRequestStream.newBuilder().setAge(10086).build()).forEachRemaining((my)->{
//            System.out.println(my.getAge());
//            System.out.println(my.getCity());
//            System.out.println(my.getUsername());
//        });

////        输出流
//        StreamObserver<MyRequest> myResponseStream = stub.getMyResponseStream(new StreamObserver<MyResponseList>() {
//            @Override
//            public void onNext(MyResponseList myResponseList) {
//                System.out.println("addList");
//            }
//
//            @Override
//            public void onError(Throwable throwable) {
//                System.out.println(throwable.getMessage());
//            }
//
//            @Override
//            public void onCompleted() {
//                System.out.println("onCompleted");
//            }
//        });
//        myResponseStream.onNext(MyRequest.newBuilder().setUsername("shiki").build());
//        myResponseStream.onNext(MyRequest.newBuilder().setUsername("shiki1").build());
//        myResponseStream.onNext(MyRequest.newBuilder().setUsername("shiki2").build());
//        myResponseStream.onNext(MyRequest.newBuilder().setUsername("shiki3").build());
//        myResponseStream.onCompleted();

//        双向流
        StreamObserver<MyRequest> streamObserver = stub.biTalk(new StreamObserver<MyResponse>() {
            @Override
            public void onNext(MyResponse myResponse) {
                System.out.println(myResponse.getRealname());
            }

            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
            }

            @Override
            public void onCompleted() {
                System.out.println("onCompleted");
            }
        });
        for (int i = 0; i < 10; i++) {
            streamObserver.onNext(MyRequest.newBuilder().setUsername("-shiki"+i).build());
            TimeUnit.MILLISECONDS.sleep(1000);
        }
        streamObserver.onCompleted();
       TimeUnit.MILLISECONDS.sleep(3000);
    }
}
