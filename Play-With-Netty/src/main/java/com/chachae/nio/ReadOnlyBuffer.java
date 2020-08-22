package com.chachae.nio;

import java.nio.IntBuffer;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/8/17 18:31
 */
public class ReadOnlyBuffer {

  public static void main(String[] args) {
    IntBuffer intBuffer = IntBuffer.allocate(64);
    for (int i = 0; i < 64; i++) {
      intBuffer.put((byte) i);
    }
    // 读写切换
    intBuffer.flip();
    // 只读 Buffer
    IntBuffer readOnlyBuffer = intBuffer.asReadOnlyBuffer();
    // class java.nio.HeapIntBufferR（只读：HeapIntBufferR）
    System.out.println(readOnlyBuffer.getClass());
    while (readOnlyBuffer.hasRemaining()) {
      System.out.println(readOnlyBuffer.get());
    }

    // 抛出：java.nio.ReadOnlyBufferException
    readOnlyBuffer.put((byte) 1);
  }
}
