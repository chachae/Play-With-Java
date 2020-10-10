package com.chachae.lanqiao.groupb_2016;

/**
 *
 * @author chachae
 * @date 2020/10/10 11:28
 * @version v1.0
 */
public class No02 {

  public static void main(String[] args) {
    // 假设1岁开始
    int start = 1;
    // 99 岁结束
    int end = 100;
    // 共计吹灭
    int all = 236;
    // 结果
    int ans = 1;
    for (int i = start; i < end; i++) {
      int n = i;
      // 蜡烛计数器
      int cnt = 0;
      while (cnt < all) {
        cnt += n++;
        // 找到了~
        if (cnt == all) {
          ans = i;
          i = end;
          break;
        }
      }
    }
    System.out.println(ans);
  }
}
