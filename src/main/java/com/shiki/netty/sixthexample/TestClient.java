package com.shiki.netty.sixthexample;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

/**
 * @author: shiki
 * @date: 2019/11/11 下午3:55
 * @description:
 */
public class TestClient {
    public static void main(String[] args) throws InterruptedException {
        EventLoopGroup eventLoopGroup = new NioEventLoopGroup();
        try {
            new Bootstrap().group(eventLoopGroup).channel(NioSocketChannel.class)
                    .handler(new TestClientInitializer())
                    .connect("localhost", 8899).sync()
                    .channel().closeFuture().sync();
        } finally {
            eventLoopGroup.shutdownGracefully();
        }
    }
}
