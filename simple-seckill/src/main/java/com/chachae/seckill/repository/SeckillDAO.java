package com.chachae.seckill.repository;

import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author chachae
 * @since 2020/3/23 20:40
 */
@Repository
public class SeckillDAO {

  /** 模拟商品 */
  private static Map<Integer, Object> map = new ConcurrentHashMap<>();

  // 初始化商品数量
  static {
    int goodsNums = 100;
    for (Integer i = 0; i < goodsNums; i++) {
      map.put(i, i);
    }
  }

  public Map<Integer, Object> list() {
    return map;
  }

  public Integer getCount() {
    return list().size();
  }

  public void remove() {
    int count = getCount();
    list().remove(count - 1);
  }

  public void update(int count) {
    for (Integer i = 0; i < count; i++) {
      map.put(i, i);
    }
  }
}
