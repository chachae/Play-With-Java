package com.chachae.leetcode.No_1414;

/**
 * https://leetcode-cn.com/problems/find-the-minimum-number-of-fibonacci-numbers-whose-sum-is-k/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public static void main(String[] args) {
    System.out.println(new Solution().findMinFibonacciNumbers(20));
  }

  public int findMinFibonacciNumbers(int k) {
    int res = 0;
    int a = 1;
    int b = 1;
    int max = 0;
    int lastIndex;
    int[] minArray = new int[50];
    minArray[0] = minArray[1] = lastIndex = 1;
    while (max < k) {
      max = a + b;
      minArray[++lastIndex] = max;
      a = b;
      b = max;
    }

    while (lastIndex > -1) {
      if (minArray[lastIndex] <= k) {
        k -= minArray[lastIndex];
        ++res;
      }
      if (k == 0) {
        break;
      }
      --lastIndex;
    }
    return res;
  }
}