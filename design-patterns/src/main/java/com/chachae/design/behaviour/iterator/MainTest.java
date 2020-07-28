package com.chachae.design.behaviour.iterator;

import cn.hutool.log.Log;

/**
 * 迭代器模式
 *
 * @author chachae
 * @version v1.0
 * @date 2020/7/23 15:53
 */
public class MainTest {

  private static final Log log = Log.get();

  public static void main(String[] args) {
    Collection collection = new ListCollection();
    collection.add("abc");
    Iterator iterator = collection.iterator();
    while (iterator.hasNext()) {
      log.info(iterator.next().toString());
    }
  }
}
