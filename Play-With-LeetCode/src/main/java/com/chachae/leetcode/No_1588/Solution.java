package com.chachae.leetcode.No_1588;

/**
 *
 * https://leetcode-cn.com/problems/sum-of-all-odd-length-subarrays/description/
 *
 * @author chachae
 * @date 2020/10/13 17:01
 * @version v1.0
 */
class Solution {

  /**
   *
   * 1. 外层计算可能的子序列步长
   * 2. 中层确定有效子序列的起始位置索引
   * 3. 内层对每个子系列求和
   */
  public static void main(String[] args) {
    System.out.println(new Solution().sumOddLengthSubarrays(new int[]{1, 4, 2, 5, 3}));
  }

  public int sumOddLengthSubarrays(int[] arr) {
    int ans = 0;
    int len = arr.length;
    for (int i = 1; i <= len; i += 2) {
      for (int j = 0; j <= len - i; j++) {
        for (int k = j; k < j + i; k++) {
          ans += arr[k];
        }
      }
    }
    return ans;
  }
}