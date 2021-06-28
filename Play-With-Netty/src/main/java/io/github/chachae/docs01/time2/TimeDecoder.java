package io.github.chachae.docs01.time2;

import io.github.chachae.docs01.entity.UnixTime;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

import java.util.List;

/**
 * @author <a href="mailto:chenyuexin@joyy.sg">chenyuexin</a>
 * @date 2021/6/28 10:47
 */
public class TimeDecoder extends ByteToMessageDecoder {

    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) {
        if (byteBuf.readableBytes() < 4) {
            return;
        }
        list.add(new UnixTime(byteBuf.readUnsignedInt()));
    }
}
