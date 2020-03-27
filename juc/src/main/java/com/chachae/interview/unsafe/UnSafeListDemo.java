package com.chachae.interview.unsafe;

import cn.hutool.core.util.IdUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chachae
 * @since 2020/3/24 12:09
 */
public class UnSafeListDemo {

  // 不安全
  private static List<String> list = new ArrayList<>();

  // 安全
  //    private static List<String> list = new CopyOnWriteArrayList<>();
  //    private static List<String> list = Collections.synchronizedList(new ArrayList<>());
  //    private static List<String> list = new Vector<>();

  public static void main(String[] args) {

    for (int i = 0; i < 30; i++) {
      new Thread(
              () -> {
                list.add(IdUtil.fastSimpleUUID().substring(0, 3));
                System.out.println(list);
              },
              String.valueOf(i))
          .start();
    }
  }
}
