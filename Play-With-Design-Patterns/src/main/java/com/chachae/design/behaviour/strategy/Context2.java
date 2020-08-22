package com.chachae.design.behaviour.strategy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * spring
 * @author chachae
 * @version v1.0
 * @date 2020/7/25 11:04
 */
public class Context2 {

  private final Map<Integer, TravelStrategy> strategyMap = new ConcurrentHashMap<>();

  /**
   * spring 构造器注入（key:spring bean name,value:interface realize）
   *
   * @param map map
   */
  public Context2(Map<Integer, TravelStrategy> map) {
    strategyMap.clear();
    map.forEach(this.strategyMap::put);
  }

  public void travelModel(Integer id) {
    strategyMap.get(id).travelModel();
  }

}
