package com.chachae.leetcode.interview.array;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode-cn.com/problems/pascals-triangle-ii/"></a>
 *
 * @author chachae
 * @version v1.0
 * @date 2020/7/30 21:28
 */
public class No119 {

  public static void main(String[] args) {
    System.out.println(new No119().getRow(3));
  }

  public List<Integer> getRow(int rowIndex) {
    List<Integer> res = new ArrayList<>(rowIndex + 1);
    long current = 1;
    for (int i = 0; i < rowIndex + 1; i++) {
      res.add((int) current);
      current = current * (rowIndex - i) / (i + 1);
    }
    return res;
  }
}
