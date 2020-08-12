package com.chachae.netty.io.nio;

import java.nio.IntBuffer;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/8/12 23:15
 */
public class BasicBuffer {

  public static void main(String[] args) {
    final IntBuffer intBuffer = IntBuffer.allocate(10);
    for (int i = 1; i <= intBuffer.capacity(); i++) {
      intBuffer.put(i);
    }

    // 读写切换
    intBuffer.flip();

    while (intBuffer.hasRemaining()){
      System.out.println(intBuffer.get());
    }
  }
}
