package com.chachae.netty.io.bio;


import cn.hutool.log.Log;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/8/12 22:06
 */
public class BIOService {

  private static final Log log = Log.get();

  public static void main(String[] args) throws Exception {
    ExecutorService executorService = Executors.newCachedThreadPool();
    try (ServerSocket serverSocket = new ServerSocket(6000)) {
      log.info("服务启动");
      while (true) {
        Socket socket = serverSocket.accept();
        log.info("连接到一个客户端");
        executorService.execute(() -> handler(socket));
      }
    }
  }

  private static void handler(Socket socket) {
    try (InputStream inputStream = socket.getInputStream()) {
      byte[] bytes = new byte[1024];
      while (true) {
        int read = inputStream.read(bytes);
        if (read != -1) {
          System.out.println(new String(bytes, 0, read));
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        socket.close();
        log.info("关闭连接");
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}
