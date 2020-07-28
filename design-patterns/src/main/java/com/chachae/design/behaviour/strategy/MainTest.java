package com.chachae.design.behaviour.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * 策略模式
 *
 * @author chachae
 * @version v1.0
 * @date 2020/7/23 15:53
 */
public class MainTest {

  public static void main(String[] args) {
    Context context = new Context();
    context.setTravelStrategy(new TravelByCarStrategy());
    context.travelModel();
    context.setTravelStrategy(new TravelByAirStrategy());
    context.travelModel();

    // spring framework，模拟构造器注入
    Map<Integer, TravelStrategy> inject = new HashMap<>();
    inject.put(1, new TravelByCarStrategy());
    inject.put(2, new TravelByAirStrategy());
    Context2 context2 = new Context2(inject);
    context2.travelModel(1);
    context2.travelModel(2);
  }
}
