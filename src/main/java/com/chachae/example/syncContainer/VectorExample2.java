package com.chachae.example.syncContainer;

import com.chachae.annoations.NotThreadSafe;
import lombok.extern.slf4j.Slf4j;

import java.util.Vector;

/**
 * @author chachae
 * @date 2019/11/5 9:31
 */
@Slf4j
@NotThreadSafe
public class VectorExample2 {

  private static Vector<Integer> vector = new Vector<>();

  public static void main(String[] args) {

    while (true) {

      for (int i = 0; i < 10; i++) {
        vector.add(i);
      }

      Thread thread1 =
          new Thread(
              () -> {
                for (int i = 0; i < vector.size(); i++) {
                  vector.remove(i);
                }
              });

      Thread thread2 =
          new Thread(
              () -> {
                for (int i = 0; i < vector.size(); i++) {
                  vector.get(i);
                }
              });
      thread1.start();
      thread2.start();
    }
  }
}
