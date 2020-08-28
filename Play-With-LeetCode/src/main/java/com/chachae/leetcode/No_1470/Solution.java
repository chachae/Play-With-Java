package com.chachae.leetcode.No_1470;

/**
 * https://leetcode-cn.com/problems/shuffle-the-array/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  //输入：nums = [2,5,1,3,4,7], n = 3
  //输出：[2,3,5,4,1,7]
  //解释：由于 x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 ，所以答案为 [2,3,5,4,1,7]
  //          i d
  // [2,3,5,1,4,7]
  // [2,]
  // temp  =1
  // temp2 = 1

  public int[] shuffle(int[] nums, int n) {
    int indexOfLast = nums.length - 1;
    int[] res = nums.clone();
    int c = 1;
    for (int i = 1; i < indexOfLast; i += 2) {
      res[i] = nums[n++];
      res[i + 1] = nums[c++];
    }
    return res;
  }
}