package com.chachae.lanqiao.groupb_2015;

/**
 *
 * @author chachae
 * @date 2020/10/6 15:25
 * @version v1.0
 */
public class No02 {

  public static void main(String[] args) {
    int ans = 0;
    for (int i = 1; i < 100; i++) {
      int powAns = (int) Math.pow(i, 3);
      String powStr = String.valueOf(powAns);
      int sum = 0;
      for (int k = 0; k < powStr.length(); k++) {
        sum += Integer.parseInt(String.valueOf(powStr.charAt(k)));
      }
      if (sum == i) {
        System.out.println((++ans) + " : " + i);
      }
    }
    System.out.println("result : " + ans);
  }
}
