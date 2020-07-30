package com.chachae.leetcode.interview.array;

import java.util.Arrays;

/**
 * <a href="https://leetcode-cn.com/problems/reshape-the-matrix/">566</a>
 *
 * @author chachae
 * @version v1.0
 * @date 2020/7/29 21:58
 */
public class No566 {

  public static void main(String[] args) {
    No566 obj = new No566();
    int[][] nums = new int[2][2];
    nums[0][0] = 1;
    nums[0][1] = 2;
    nums[1][0] = 3;
    nums[1][1] = 4;
    System.out.println(Arrays.deepToString(obj.matrixReshape(nums, 1, 4)));
  }

  private int[] caseArr(int[][] nums) {
    int r = nums.length;
    int c = nums[0].length;
    int index = 0;
    int[] res = new int[r * c];
    for (int[] num : nums) {
      for (int j = 0; j < c; j++) {
        res[index++] = num[j];
      }
    }

    return res;
  }

  public int[][] matrixReshape(int[][] nums, int r, int c) {
    if (nums.length == 0) {
      return nums;
    } else {
      if (nums[0].length * nums.length == r * c) {
        int[] newNums = caseArr(nums);
        int[][] res = new int[r][c];
        int index = 0;
        for (int i = 0; i < res.length; i++) {
          for (int j = 0; j < res[0].length; j++) {
            res[i][j] = newNums[index++];
          }
        }
        return res;
      } else {
        return nums;
      }
    }
  }
}
