package com.chachae.algorithm.imooc.stack_and_queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode-cn.com/problems/perfect-squares/ 解法：BFS
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/20 13:52
 */
public class PerfectSquares {

  public static void main(String[] args) {
    new PerfectSquares().numSquares(12);
  }

  public int numSquares(int n) {
    if (n <= 0) {
      return 0;
    }
    int res = 0;
    Queue<Integer> queue = new LinkedList<>();
    boolean[] bm = new boolean[n + 1];
    queue.add(n);
    while (!queue.isEmpty()) {
      res++;
      int size = queue.size();
      while (size-- > 0) {
        int e = queue.poll();
        for (int i = 1; e >= i * i; i++) {
          int cal = e - i * i;
          if (cal == 0) {
            return res;
          } else if (cal > 0 && !bm[cal]) {
            queue.add(cal);
            bm[cal] = true;
          }
        }
      }
    }
    return -1;
  }
}
