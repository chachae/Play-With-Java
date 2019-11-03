package com.chachae.example.immutable;

import cn.hutool.core.lang.Console;
import com.chachae.annoations.ThreadSafe;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import lombok.extern.slf4j.Slf4j;

/**
 * @author chachae
 * @date 2019/11/3 22:04
 */
@Slf4j
@ThreadSafe
public class ImmutableExample3 {

  private static ImmutableList<Integer> list = ImmutableList.of(1, 2, 3, 4, 5);
  private static ImmutableSet<Integer> set = ImmutableSet.copyOf(list);
  private static ImmutableMap<Integer, Integer> map = ImmutableMap.of(1, 2, 3, 4);
  private static ImmutableMap<Integer, Integer> map2 =
      ImmutableMap.<Integer, Integer>builder().put(1, 2).put(3, 4).build();

  public static void main(String[] args) {
    Console.log("list:" + list);
    Console.log("set:" + set);
    Console.log("map:" + map);
    Console.log("map2:" + map2);
    // 不允许修改，抛异常
    map.put(1, 3);
    map2.put(1, 3);
  }
}
