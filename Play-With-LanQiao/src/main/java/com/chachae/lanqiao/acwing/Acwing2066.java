package com.chachae.lanqiao.acwing;

import java.util.Scanner;

/**
 *
 * @author chachae
 * @date 2020/10/11 16:50
 * @version v1.0
 */
public class Acwing2066 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String str = in.next();
    in.close();
    System.out.println(parseStr(str));
  }

  private static String parseStr(String str) {
    StringBuilder ans = new StringBuilder();
    char[] chs = str.toCharArray();
    for (int i = 0; i < chs.length; i++) {
      if (chs[i] >= 48 && chs[i] <= 57) {
        append(ans, chs[i - 1], Integer.parseInt(String.valueOf(chs[i])));
      } else {
        ans.append(chs[i]);
      }
    }
    return ans.toString();
  }

  private static void append(StringBuilder str, char appendStr, int num) {
    for (int i = 0; i < num - 1; i++) {
      str.append(appendStr);
    }
  }
}
