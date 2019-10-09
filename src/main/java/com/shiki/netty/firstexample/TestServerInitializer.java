package com.shiki.netty.firstexample;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpServerCodec;

/**
 * @author: shiki
 * @description netty
 * @date: 2019/8/31 上午11:58
 */
public class TestServerInitializer extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline pipeline = ch.pipeline();
        pipeline.addLast("httpServerCodec", new HttpServerCodec())
                .addLast("testHttpServerHandle", new TestHttpServerHandle());
    }

    interface Aa {
        /**
         * aaa
         */
        void add();
    }

    static class Bb implements Aa {

        @Override
        public void add() {

        }
    }
}
