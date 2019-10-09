package com.shiki.netty.firstexample;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * @author shiki
 */
public class TestServer {
    public static void main(String[] args) throws InterruptedException {
        /*
         * 不断地从客户端接受请求但是不处理,将其交给workerGroup进行处理
         */
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        /*
         * 真正的对连接进行处理,比如获取连接的参数,进行实际的业务处理,并返回给前端
         */
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        try {

            /*
             * 注册自定义的处理方法
             */
            ServerBootstrap serverBootstrap = new ServerBootstrap();
            serverBootstrap.group(bossGroup, workerGroup).channel(NioServerSocketChannel.class)
                    .childHandler(new TestServerInitializer());
            /*
             * 绑定监听端口
             */
            ChannelFuture channelFuture = serverBootstrap.bind(8899).sync();
            /*
             * 监听关闭
             */
            channelFuture.channel().closeFuture().sync();
        }finally {
            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        }
    }
}
