package com.chachae.guigu.sparse_array;

import java.util.Arrays;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/29 11:06
 */
public class SparseArrayExample {

  public static void main(String[] args) {
    int[][] arr = new int[11][11];
    arr[2][3] = 1;
    arr[4][7] = 2;
    arr[5][10] = 2;

    // 统计非0
    int unZeroNum = 0;
    for (int[] ints : arr) {
      for (int e : ints) {
        if (e != 0) {
          unZeroNum++;
        }
      }
    }

    // 创建稀疏数组
    int[][] sparseArr = new int[unZeroNum + 1][3];
    sparseArr[0][0] = sparseArr[0][1] = 11;
    sparseArr[0][2] = unZeroNum;

    // 赋值
    int start = 0;
    for (int i = 0; i < 11; i++) {
      for (int j = 0; j < 11; j++) {
        if (arr[i][j] != 0) {
          sparseArr[++start][0] = i;
          sparseArr[start][1] = j;
          sparseArr[start][2] = arr[i][j];
        }
      }
    }

    // 打印稀疏数组
    for (int[] ints : sparseArr) {
      System.out.println(Arrays.toString(ints));
    }

    // 恢复稀疏数组
    int[][] resetArr = new int[sparseArr[0][0]][sparseArr[0][1]];
    for (int i = 1; i < sparseArr.length; i++) {
      resetArr[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2];
    }
    for (int[] ints : resetArr) {
      for (int e : ints) {
        System.out.print(e + "\t");
      }
      System.out.println();
    }
  }
}
