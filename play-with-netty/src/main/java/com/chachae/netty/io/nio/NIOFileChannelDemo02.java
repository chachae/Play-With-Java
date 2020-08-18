package com.chachae.netty.io.nio;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 读取数据
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/17 18:31
 */
public class NIOFileChannelDemo02 {

  public static void main(String[] args) throws Exception {
    // 获取输出流
    File file = new File("play-with-netty/files/file01.txt");
    FileInputStream fileOutputStream = new FileInputStream(file);
    // 获得通道
    FileChannel channel = fileOutputStream.getChannel();
    // 创建一个byte的buffer并将文件数据斜土通道
    ByteBuffer byteBuffer = ByteBuffer.allocate((int) file.length());
    channel.read(byteBuffer);
    // 打印内容
    System.out.println(new String(byteBuffer.array()));
    // 关闭流
    fileOutputStream.close();
  }
}
