package com.chachae.example.threadLocal;

/**
 * @author chachae
 * @date 2019/11/4 11:36
 */
public class RequestHolder {

  private static final ThreadLocal<Long> REQUEST_HOLDER = new ThreadLocal<>();

  public static void add(Long id) {
    REQUEST_HOLDER.set(id);
  }

  public static Long getId() {
    return REQUEST_HOLDER.get();
  }

  public static void remove() {
    REQUEST_HOLDER.remove();
  }
}
