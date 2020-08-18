package com.chachae.netty.io.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 拷贝文件数据
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/17 18:31
 */
public class NIOFileChannelDemo03 {

  public static void main(String[] args) throws Exception {
    // 获取输出流
    FileInputStream fileInputStream = new FileInputStream("play-with-netty/files/file02.txt");
    FileChannel channel01 = fileInputStream.getChannel();
    // 获取输入流
    FileOutputStream fileOutputStream = new FileOutputStream("play-with-netty/files/file03.txt");
    FileChannel channel02 = fileOutputStream.getChannel();
    // 创建一个byte的buffer
    ByteBuffer byteBuffer = ByteBuffer.allocate(10);
    while (true) {
      byteBuffer.clear();
      int read = channel01.read(byteBuffer);
      byteBuffer.flip();
      channel02.write(byteBuffer);
      if (read == -1) {
        break;
      }
    }
    channel02.close();
    fileInputStream.close();
  }
}
