package com.shiki.netty.sixthexample;

import com.shiki.protobuf.DataInfo;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author: shiki
 * @date: 2019/11/11 下午4:04
 * @description:
 */
public class TestClientHandler extends SimpleChannelInboundHandler<DataInfo.Student> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, DataInfo.Student msg) throws Exception {

    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        ctx.writeAndFlush(DataInfo.Student.newBuilder().setAddress("萧山").setName("shiki").setAge(18));
    }
}
