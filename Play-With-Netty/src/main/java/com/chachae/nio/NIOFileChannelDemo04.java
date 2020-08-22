package com.chachae.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/**
 * 拷贝文件
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/17 18:31
 */
public class NIOFileChannelDemo04 {

  public static void main(String[] args) throws Exception {
    // 获取输出流
    FileInputStream fileInputStream = new FileInputStream("play-with-netty/files/file03.txt");
    FileChannel source = fileInputStream.getChannel();
    // 获取输入流
    FileOutputStream fileOutputStream = new FileOutputStream("play-with-netty/files/file04.txt");
    FileChannel dest = fileOutputStream.getChannel();

    dest.transferFrom(source, 0, source.size());
    dest.close();
    source.close();
  }
}
