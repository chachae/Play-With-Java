package com.chachae.example.immutable;

import com.chachae.annoations.NotThreadSafe;
import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * @author chachae
 * @date 2019/11/3 22:04
 */
@Slf4j
@NotThreadSafe
public class ImmutableExample1 {

  private final int a = 1;
  private final String b = "Hello";
  private static final Map<Integer, Integer> map = Maps.newHashMap();

  static {
    map.put(1, 2);
    map.put(3, 4);
    map.put(5, 6);
  }

  public static void main(String[] args) {
    // 修改前
    log.info("{}", map);
    // 此处允许修改，输出10
    map.put(1, 10);
    log.info("{}", map.get(1));
  }

  public void test2(final int a) {
    // a=1;
    // 不允许修改
  }
}
