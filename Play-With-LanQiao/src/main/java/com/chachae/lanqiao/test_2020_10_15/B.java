package com.chachae.lanqiao.test_2020_10_15;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author chachae
 * @date 2020/10/15 18:35
 * @version v1.0
 */
public class B {

  public static void main(String[] args) throws Exception {
    SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
    Date d1 = df.parse("19210723120000");
    Date d2 = df.parse("20200701120000");
    System.out.println((d2.getTime() - d1.getTime()) / 1000 / 60);  // 52038720
  }
}
