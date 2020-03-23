package com.chachae.example.immutable;

import com.chachae.annotations.ThreadSafe;
import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;

import java.util.Collections;
import java.util.Map;

/**
 * @author chachae
 * @date 2019/11/3 22:04
 */
@Slf4j
@ThreadSafe
public class ImmutableExample2 {

  private static Map<Integer, Integer> map = Maps.newHashMap();

  static {
    map.put(1, 2);
    map.put(3, 4);
    map.put(5, 6);
    // unmodifiableMap：不允许修改
    map = Collections.unmodifiableMap(map);
  }

  public static void main(String[] args) {
    // 修改前
    log.info("{}", map);
    // 此处不允许修改，抛出异常
    map.put(1, 10);
    log.info("{}", map.get(1));
  }
}
