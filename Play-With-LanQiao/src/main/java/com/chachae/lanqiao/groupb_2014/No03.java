package com.chachae.lanqiao.groupb_2014;

import java.util.LinkedList;
import java.util.List;

/**
 *https://blog.csdn.net/hyx153183740/article/details/104163097
 *
 * @author chachae
 * @date 2020/10/5 21:20
 * @version v1.0
 */
public class No03 {

  public static void main(String[] args) {
    List<Character> records = new LinkedList<>();
    for (int i = 0; i < 106; i++) {
      for (int j = 1; j <= 19; j++) {
        records.add((char) (96 + j));
      }
    }
    while (records.size() != 1) {
      List<Character> newRecords = new LinkedList<>();
      for (int i = 1; i < records.size(); i += 2) {
        newRecords.add(records.get(i));
      }
      records = newRecords;
    }
    System.out.println(records.get(0));
  }
}
