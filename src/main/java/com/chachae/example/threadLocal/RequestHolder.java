package com.chachae.example.threadLocal;

/**
 * @author chachae
 * @date 2019/11/4 11:36
 */
public class RequestHolder {

  private static final ThreadLocal<Long> requestHolder = new ThreadLocal<>();

  public static void add(Long id) {
    requestHolder.set(id);
  }

  public static Long getId() {
    return requestHolder.get();
  }

  public static void remove() {
    requestHolder.remove();
  }
}
