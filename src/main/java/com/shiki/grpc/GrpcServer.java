package com.shiki.grpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

/**
 * @author: shiki
 * @date: 2019/11/13 上午11:52
 * @description:
 */
public class GrpcServer {
    private Server server;

    private void start() throws IOException {
        this.server = ServerBuilder
                .forPort(8899)
                .addService(new PersonServiceImpl())
                .build()
                .start();
        System.out.println("server started");
        Runtime.getRuntime().addShutdownHook(new Thread(()->{
            System.out.println("关闭jvm");
            GrpcServer.this.stop();
        }));
    }

    private void stop() {
        if (this.server != null) {
            this.server.shutdown();
        }
    }

    private void awaitTermination() throws InterruptedException {
        if (this.server != null) {
            this.server.awaitTermination();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        GrpcServer server = new GrpcServer();
        server.start();
        server.awaitTermination();
    }
}
