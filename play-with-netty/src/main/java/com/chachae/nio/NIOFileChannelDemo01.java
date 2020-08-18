package com.chachae.nio;

import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 写入数据
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/17 18:31
 */
public class NIOFileChannelDemo01 {

  public static void main(String[] args) throws Exception {
    // 待写入内容
    String msg = "🐂，牛，cattle";
    // 获取输出流
    FileOutputStream fileOutputStream = new FileOutputStream("play-with-netty/files/file01.txt");
    // 获得通道
    FileChannel channel = fileOutputStream.getChannel();
    // 创建一个byte的buffer并写入数据
    ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
    byteBuffer.put(msg.getBytes());
    // 读写切换（写->读）
    byteBuffer.flip();
    // 写入通道
    channel.write(byteBuffer);
    // 关闭流
    fileOutputStream.close();
  }
}
