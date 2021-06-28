package io.github.chachae.docs01.time;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

import java.util.List;

/**
 * <p>
 * 每当有新数据接收的时候，ByteToMessageDecoder 都会调用 decode() 方法来处理内部的 那个累积缓冲。
 * </p>
 *
 * @author <a href="mailto:chenyuexin@joyy.sg">chenyuexin</a>
 * @date 2021/6/28 10:30
 */
public class TimeDecoder extends ByteToMessageDecoder {

    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        if (byteBuf.readableBytes() < 4) {
            return;
        }
        list.add(byteBuf.readBytes(4));
    }
}
