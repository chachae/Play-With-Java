package com.chachae.lanqiao.groupb_2013;

import java.math.BigDecimal;

/**
 *
 * @author chachae
 * @date 2020/10/5 19:58
 * @version v1.0
 */
public class No04 {

  public static void main(String[] args) {
    BigDecimal bd = new BigDecimal(1);
    for (int i = 0; i < 1000; i++) {
      bd = bd.add(BigDecimal.ONE);
      bd = BigDecimal.ONE.divide(bd, 100, BigDecimal.ROUND_HALF_DOWN);
    }
    System.out.println(bd.toString());
  }
}