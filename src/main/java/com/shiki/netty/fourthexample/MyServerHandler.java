package com.shiki.netty.fourthexample;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.timeout.IdleStateEvent;

/**
 * @author: shiki
 * @date: 2019/11/8 下午6:31
 * @description: 自定义netty服务器的处理
 */
public class MyServerHandler extends ChannelInboundHandlerAdapter {
    /**
     *
     */
    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        if (evt instanceof IdleStateEvent) {
            IdleStateEvent event = (IdleStateEvent) evt;
            String eventType;
            switch (event.state()) {
                case READER_IDLE:
                    eventType = "读空闲";
                    break;
                case WRITER_IDLE:
                    eventType = "写空闲";
                    break;
                case ALL_IDLE:
                    eventType = "读写空闲";
                    break;
                default:
                    throw new RuntimeException();
            }
            System.out.println(ctx.channel().remoteAddress() + "超时事件" + eventType);
            ctx.channel().close();
        }
    }
}
