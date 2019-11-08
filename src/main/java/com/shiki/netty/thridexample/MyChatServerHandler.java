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

    /**
     * 用于管理所有与服务器连接的channel对象
     */
    private static ChannelGroup channelGroup = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, String msg) throws Exception {
///        channelGroup.remove(ctx.channel());
        channelGroup.forEach(ch -> {
            if (ch == ctx.channel()) {
                ch.write("自己: " + msg + "\n");
            } else {
                ch.write(ctx.channel().remoteAddress() + "发来的消息" + msg + "\n");
            }
        });
        channelGroup.flush();
//        channelGroup.writeAndFlush(ctx.channel().remoteAddress() + "发来的消息" + msg + "\n");
//        ctx.writeAndFlush("自己" + msg + "\n");
//        channelGroup.add(ctx.channel());
    }

    /**
     * 链接加入时
     */
    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
        channelGroup.writeAndFlush("用户 - " + ctx.channel().remoteAddress() + "加入\n");
//        加入channel组中
        channelGroup.add(ctx.channel());
    }

    /**
     * 连接处于活动状态
     */
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("用户 - " + ctx.channel().remoteAddress() + "上线");
    }

    /**
     * 不活跃
     */
    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("用户 - " + ctx.channel().remoteAddress() + "下线");
    }

    /**
     * 当断开连接是netty会自动寻找并删除channelGroup中的连接属性
     */
    @Override
    public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
        channelGroup.writeAndFlush("用户 - " + ctx.channel().remoteAddress() + "离开\n");
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}
