package com.chachae.lanqiao.acwing.lanqiao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author chachae
 * @date 2020/10/5 16:35
 * @version v1.0
 */
public class Main1204 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int lineCount = sc.nextInt();
    List<Integer> records = new ArrayList<>();
    while (sc.hasNext()) {
      records.add(sc.nextInt());
    }
    records.sort(Comparator.comparingInt(o -> o));
    int a = 0;
    int b = 0;
    int slow = records.get(0);
    for (int i = 1; i < records.size(); i++) {
      if (slow + 1 == records.get(i)) {
        slow = records.get(i);
      } else if (slow == records.get(i)) {
        b = slow;
        slow = records.get(i);
      } else {
        a = slow + 1;
        slow = records.get(i);
      }
    }
    System.out.println(a + " " + b);
  }
}
