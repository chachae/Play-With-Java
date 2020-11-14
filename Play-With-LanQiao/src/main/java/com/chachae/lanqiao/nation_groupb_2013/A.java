package com.chachae.lanqiao.nation_groupb_2013;

/**
 * 1.标题：猜灯谜
 * <p>
 * A 村的元宵节灯会上有一迷题：
 * <p>
 * 请猜谜 * 请猜谜 = 请边赏灯边猜
 * <p>
 * 小明想，一定是每个汉字代表一个数字，不同的汉字代表不同的数字。
 * <p>
 * 请你用计算机按小明的思路算一下，然后提交“请猜谜”三个字所代表的整数即可。
 * <p>
 * 请严格按照格式，通过浏览器提交答案。 注意：只提交一个3位的整数，不要写其它附加内容，比如：说明性的文字。
 *
 * @author chachae
 * @version v1.0
 * @date 2020/11/9 21:24
 */
public class A {

  public static void main(String[] args) {

    for (int a = 0; a <= 9; a++) {
      for (int b = 0; b <= 9; b++) {
        if (a != b) {
          for (int c = 0; c <= 9; c++) {
            if (a != c && b != c) {
              int abc = a * 100 + b * 10 + c;
              int pow = abc * abc;
              String str = String.valueOf(pow);
              if (str.length() == 6) {
                char[] chs = str.toCharArray();
                if (chs[0] == a + '0' && chs[5] == b + '0' && chs[1] == chs[4] && chs[2] != chs[0] && chs[2] != chs[1] && chs[3] != chs[0] && chs[3] != chs[1] && chs[3] != chs[2] && chs[2] != c + '0'
                    && chs[3] != c + '0') {
                  System.out.printf("请 : %s%n猜 : %s%n谜 : %s ", a, b, c);
                  break;
                }
              }
            }
          }
        }
      }
    }
  }

}
