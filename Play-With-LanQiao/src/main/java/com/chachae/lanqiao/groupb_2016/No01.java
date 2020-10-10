package com.chachae.lanqiao.groupb_2016;

/**
 *
 * https://blog.csdn.net/hyx153183740/article/details/104169116
 *
 * 题目描述：
 * 有一堆煤球，堆成三角棱锥形。具体：
 * 第一层放1个，
 * 第二层3个（排列成三角形），
 * 第三层6个（排列成三角形），
 * 第四层10个（排列成三角形），
 * …
 * 如果一共有100层，共有多少个煤球？
 *
 * 请填表示煤球总数目的数字。
 * 注意：你提交的应该是一个整数，不要填写任何多余的内容或说明性文字
 *
 * @author chachae
 * @date 2020/10/10 11:16
 * @version v1.0
 */
public class No01 {

  public static void main(String[] args) {

    // 层数
    int floor = 100;
    // 当前层的数量
    int curNum;
    int ans = 0;
    int pos = 1;
    int start = 0;
    while (floor-- > 0) {
      curNum = pos + start;
      ans += curNum;
      start = curNum;
      pos++;
    }

    System.out.println(ans);

  }

}
