package com.chachae.imooc.linked;

import org.junit.jupiter.api.Test;

/**
 * 递归求和
 *
 * @author chachae
 * @since 2020/4/9 12:09
 */
public class Sum {

  @Test
  public void test() {
    System.out.println(sum(100));
  }

  public int sum(int end) {
    return end == 0 ? 0 : end + sum(end - 1);
  }
}
