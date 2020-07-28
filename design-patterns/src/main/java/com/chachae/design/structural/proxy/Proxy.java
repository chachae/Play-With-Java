package com.chachae.design.structural.proxy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/24 11:54
 */
public class Proxy implements Company {

  private final HR hr;

  private static final Map<String, String> map = new ConcurrentHashMap<>();

  static {
    map.put("Python", "Joe");
    map.put("Java", "Kim");
    map.put("Go", "Sui");
  }

  public Proxy() {
    super();
    this.hr = new HR();
  }

  /**
   * 被代理
   */
  @Override
  public void findWork(String title) {
    hr.findWork(title);
    String worker = getWorker(title);
    System.out.println("Find a worker by proxy,name is:" + worker);
  }

  private String getWorker(String title) {
    return map.get(title);
  }
}
