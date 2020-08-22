package com.chachae.design.behaviour.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/28 21:53
 */
public class Context {

  private final Map<String, Object> map = new HashMap<>();

  public void assign(String key, Object value) {
    // 在环境类中设置
  }

  public String get(String key) {
    // 获取存储在环境类中行的值
    return "";
  }

}
