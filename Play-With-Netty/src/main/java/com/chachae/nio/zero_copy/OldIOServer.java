package com.chachae.nio.zero_copy;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 普通javaIO拷贝文件_服务端
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/19 11:19
 */
public class OldIOServer {

  public static void main(String[] args) throws Exception {
    // 创建服务端socket，绑定端口
    ServerSocket serverSocket = new ServerSocket(7001);

    while (true) {
      // 监听服务端通道
      Socket socket = serverSocket.accept();
      // 创建数据输入流
      DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
      try {
        // 新建缓存区，存放客户端发送的文件byte数据
        byte[] byteArray = new byte[4096];
        while (true) {
          int readCount = dataInputStream.read(byteArray, 0, byteArray.length);
          if (-1 == readCount) {
            // 循环读取，读取完成退出循环
            break;
          }
        }
      } catch (Exception ex) {
        ex.printStackTrace();
      }
    }
  }
}
