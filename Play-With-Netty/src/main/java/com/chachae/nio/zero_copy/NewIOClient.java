package com.chachae.nio.zero_copy;

import java.io.FileInputStream;
import java.net.InetSocketAddress;
import java.nio.channels.FileChannel;
import java.nio.channels.SocketChannel;

/**
 * NIO 零拷贝客户端
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/19 11:19
 */
public class NewIOClient {

  public static void main(String[] args) throws Exception {
    // 创建客户端通道连接实例
    SocketChannel socketChannel = SocketChannel.open();
    // 连接服务端
    socketChannel.connect(new InetSocketAddress("localhost", 7001));

    String filename = "play-with-netty/files/file01.txt";
    // 创建文件channel
    FileChannel fileChannel = new FileInputStream(filename).getChannel();
    // 记录文件开始传输的时间
    long startTime = System.currentTimeMillis();

    // 在linux下一个transferTo 方法就可以完成传输
    // 在windows 下 一次调用 transferTo 只能发送8m , 就需要分段传输文件, 而且要主要
    // 传输时的位置 =》 课后思考...
    // transferTo 底层使用到零拷贝
    long transferCount = fileChannel.transferTo(0, fileChannel.size(), socketChannel);
    System.out.println("发送的总的字节数 =" + transferCount + " 耗时:" + (System.currentTimeMillis() - startTime));

    //关闭
    fileChannel.close();
  }
}