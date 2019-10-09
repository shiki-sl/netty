package com.shiki.netty.thridexample;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;

/**
 * @author: shiki
 * @description
 * @date: 2019/9/1 上午12:52
 */
public class MyChatServerHandler extends SimpleChannelInboundHandler<String> {

    private static ChannelGroup channelGroup = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, String msg) throws Exception {
        channelGroup.remove(ctx.channel());
        channelGroup.writeAndFlush(ctx.channel().remoteAddress() + "发来的消息" + msg + "\n");
        ctx.writeAndFlush("自己" + msg + "\n");
        channelGroup.add(ctx.channel());
    }

    //    链接加入时
    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
        channelGroup.writeAndFlush("用户 - " + ctx.channel().remoteAddress() + "加入\n");
//        加入channel组中
        channelGroup.add(ctx.channel());
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        channelGroup.writeAndFlush("用户 - " + ctx.channel().remoteAddress() + "上线\n");
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        channelGroup.writeAndFlush("用户 - " + ctx.channel().remoteAddress() + "下线\n");
    }

    @Override
    public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
        channelGroup.writeAndFlush("用户 - " + ctx.channel().remoteAddress() + "离开\n");
//        System.out.println(ctx.channel().remoteAddress()+"下线");
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}
