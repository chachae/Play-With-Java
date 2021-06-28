/**
 * 关闭一个 Netty 应用往往只需要简单地通过 shutdownGracefully() 方法来关闭你构建的所有的 EventLoopGroup。
 * 当EventLoopGroup 被完全地终止,并且对应的所有 channel 都已经被关闭 时，Netty 会返回一个Future对象来通知你。
 *
 * @author <a href="mailto:chenyuexin@joyy.sg">chenyuexin</a>
 * @date 2021/6/28 11:21
 */
package io.github.chachae.docs01.shutdown;