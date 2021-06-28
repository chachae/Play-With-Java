package io.github.chachae.docs01.time2;

import io.github.chachae.docs01.entity.UnixTime;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * @author <a href="mailto:chenyuexin@joyy.sg">chenyuexin</a>
 * @date 2021/6/28 10:51
 */
public class TimeServerHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelActive(ChannelHandlerContext ctx) {
        ChannelFuture channelFuture = ctx.writeAndFlush(new UnixTime());
        channelFuture.addListener(ChannelFutureListener.CLOSE);
    }
}
