package io.github.chachae.docs01.echo;

import io.github.chachae.docs01.discard.DiscardServerHandler;
import io.netty.channel.ChannelHandlerContext;
import lombok.extern.slf4j.Slf4j;

/**
 * Writing an Echo Server 写个应答服务器
 *
 * @author <a href="mailto:chenyuexin@joyy.sg">chenyuexin</a>
 * @date 2021/6/25 14:07
 */
@Slf4j
public class EchoServerHandler extends DiscardServerHandler {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) {
        ctx.write(msg);
        ctx.flush();
        // 上面两步等同于 => ctx.writeAndFlush(msg);
    }
}
