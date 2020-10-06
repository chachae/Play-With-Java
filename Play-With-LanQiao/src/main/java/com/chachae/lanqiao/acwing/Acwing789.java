package com.chachae.lanqiao.acwing;

import java.util.Scanner;

/**
 *
 * @author chachae
 * @date 2020/10/6 13:47
 * @version v1.0
 */
public class Acwing789 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int q = input.nextInt();
    int arr1[] = new int[n];
    int arr2[] = new int[q];
    for (int i = 0; i < n; i++) {
      arr1[i] = input.nextInt();
    }
    for (int i = 0; i < q; i++) {
      arr2[i] = input.nextInt();//需要查找的数我们存到一个数组里
    }
    for (int i = 0; i < q; i++) {
      int l = 0;
      int r = n - 1;
      while (l < r) {
        int mid = (l + r) / 2;
        if (arr1[mid] >= arr2[i]) {
          r = mid;
        } else {
          l = mid + 1;
        }
      }
      //如果找到了最左边的那个，就继续找右边那个，如果没有直接输出“-1 -1”
      if (arr1[l] == arr2[i]) {
        int ansl = l;
        r = n - 1;
        while (l < r) {
          int mid = (r + l + 1) / 2;
          if (arr1[mid] <= arr2[i]) {
            l = mid;
          } else {
            r = mid - 1;
          }
        }
        System.out.println(ansl + " " + r);

      } else {
        System.out.println("-1 -1");
      }
    }
  }
}