package io.github.chachae.docs01.time2;

import io.github.chachae.docs01.entity.UnixTime;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author <a href="mailto:chenyuexin@joyy.sg">chenyuexin</a>
 * @date 2021/6/28 10:49
 */
@Slf4j
public class TimeClientHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) {
        UnixTime ut = (UnixTime) msg;
        log.info("time : {}", ut.toString());
        ctx.close();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        cause.printStackTrace();
        ctx.close();
    }
}
