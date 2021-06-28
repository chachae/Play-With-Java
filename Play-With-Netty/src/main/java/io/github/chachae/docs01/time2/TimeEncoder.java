package io.github.chachae.docs01.time2;

import io.github.chachae.docs01.entity.UnixTime;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * @author <a href="mailto:chenyuexin@joyy.sg">chenyuexin</a>
 * @date 2021/6/28 10:52
 */
public class TimeEncoder extends MessageToByteEncoder<UnixTime> {

    @Override
    protected void encode(ChannelHandlerContext ctx, UnixTime msg, ByteBuf out) {
        out.writeInt((int) msg.value());
    }
}
