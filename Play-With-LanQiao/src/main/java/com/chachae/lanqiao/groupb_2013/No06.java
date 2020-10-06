package com.chachae.lanqiao.groupb_2013;

import java.util.Arrays;

/**
 *
 * @author chachae
 * @date 2020/10/5 19:58
 * @version v1.0
 */
public class No06 {

  public static void main(String[] args) {
    int[] a = new int[]{7, -6, 4, -6, 8, 9, -4, 3, 2, 5, 7, 8, 0, -6, 4, 2, 5, -7};
    sort(a);
    System.out.println(Arrays.toString(a));
  }

  static void sort(int[] x) {
    int p = 0;
    int left = 0;
    int right = x.length - 1;

    while (p <= right) {
      if (x[p] < 0) {
        int t = x[left];
        x[left] = x[p];
        x[p] = t;
        left++;
        p++;
      } else if (x[p] > 0) {
        int t = x[right];
        x[right] = x[p];
        x[p] = t;
        right--;
      } else {
        p++;
      }
    }
  }

}