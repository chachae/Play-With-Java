package com.chachae.lanqiao.groupb_2019;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author chachae
 * @date 2020/10/10 20:58
 * @version v1.0
 */
public class No02 {

  public static void main(String[] args) {
    String str = "0100110001010001";
    Set<String> records = new HashSet<>();
    for (int i = 0; i < str.length(); i++) {
      for (int j = i; j < str.length(); j++) {
        records.add(str.substring(i, j + 1));
      }
    }
    System.out.println(records.size());
  }
}
