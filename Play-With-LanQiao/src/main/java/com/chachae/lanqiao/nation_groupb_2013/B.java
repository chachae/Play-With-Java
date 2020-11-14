package com.chachae.lanqiao.nation_groupb_2013;

/**
 * 2.标题：连续奇数和
 * <p>
 * 小明看到一本书上写着：任何数字的立方都可以表示为连续奇数的和。
 * <p>
 * 比如：
 * <p>
 * 2^3 = 8 = 3 + 5 3^3 = 27 = 7 + 9 + 11 4^3 = 64 = 1 + 3 + ... + 15
 * <p>
 * 虽然他没有想出怎么证明，但他想通过计算机进行验证。
 * <p>
 * 请你帮助小明写出 111 的立方之连续奇数和表示法的起始数字。如果有多个表示方案，选择起始数字小的方案。
 * <p>
 * 请严格按照要求，通过浏览器提交答案。 注意：只提交一个整数，不要写其它附加内容，比如：说明性的文字。
 *
 * @author chachae
 * @version v1.0
 * @date 2020/11/9 21:44
 */
public class B {

  private static int count = 0;

  public static void main(String[] args) {
    int i = 0;
    while (count == 0) {
      cutDown((int) Math.pow(111, 3), ++i);
      if (count == 1) {
        System.out.println("start : " + i);
        break;
      }
    }
  }

  private static void cutDown(int target, int start) {
    if (target == start && count == 0) {
      count++;
      return;
    }
    if (target > 0) {
      cutDown(target - start, start + 2);
    }
  }
}
