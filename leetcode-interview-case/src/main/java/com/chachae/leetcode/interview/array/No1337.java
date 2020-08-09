package com.chachae.leetcode.interview.array;

import java.util.Arrays;
import java.util.Comparator;

/**
 * <a href="https://leetcode-cn.com/problems/the-k-weakest-rows-in-a-matrix/">1337. 方阵中战斗力最弱的 K
 * 行</a>
 *
 * @author chachae
 * @version v1.0
 * @date 2020/7/30 18:03
 */
public class No1337 {

  public static void main(String[] args) {

    int[][] nums = {{1, 1, 0, 0, 0},
        {1, 1, 1, 1, 0},
        {1, 0, 0, 0, 0},
        {1, 1, 0, 0, 0},
        {1, 1, 1, 1, 1}};
    System.out.println(Arrays.toString(new No1337().kWeakestRows(nums, 3)));

  }

  public int[] kWeakestRows(int[][] mat, int k) {
    int[][] dit = new int[mat.length][2];
    for (int i = 0; i < mat.length; i++) {
      dit[i][0] = i;
      dit[i][1] = getOneNums(mat[i]);
    }

    Arrays.sort(dit, Comparator.comparingInt(c -> c[1]));
    int[] resArr = new int[k];
    for (int i = 0; i < k; i++) {
      resArr[i] = dit[i][0];
    }
    return resArr;
  }

  private int getOneNums(int[] row) {
    int res = 0;
    for (int e : row) {
      if (e == 1) {
        res++;
      }
    }
    return res;
  }
}
