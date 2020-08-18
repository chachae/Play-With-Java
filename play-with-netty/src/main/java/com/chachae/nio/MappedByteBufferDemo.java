package com.chachae.nio;

import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;

/**
 * MappedByteBuffer（可以让文件直接在对外内存中修改，不需要系统拷贝一次）
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/17 18:31
 */
public class MappedByteBufferDemo {

  public static void main(String[] args) throws Exception {
    // rw: 读写
    RandomAccessFile file = new RandomAccessFile("play-with-netty/files/file05.txt", "rw");
    FileChannel channel = file.getChannel();
    MappedByteBuffer buffer = channel.map(MapMode.READ_WRITE, 0, 10);
    buffer.put(8, (byte) 'l');
    buffer.put(9, (byte) 'd');
    channel.close();
  }
}
