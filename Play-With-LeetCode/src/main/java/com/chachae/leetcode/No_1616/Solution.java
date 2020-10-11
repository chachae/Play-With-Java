package com.chachae.leetcode.No_1616;

/**
 *
 * @author chachae
 * @date 2020/10/11 14:55
 * @version v1.0
 */
class Solution {

  public boolean checkPalindromeFormation(String a, String b) {
    // 输入：a = "ulacfd", b = "ulajiz"

    if (check(a) || check(b)) {
      return true;
    }

    b = new StringBuilder(b).reverse().toString();
    char[] chs = a.toCharArray();

    for (int i = 0; i < chs.length; i++) {
      if (b.contains(chs[i] + "") && i != chs.length - 1) {
        if (i == 0) {
          if (chs[i + 1] == b.charAt(i + 1)) {
            return true;
          }
        } else {
          if (checkPalindromeFormation(i, chs.length, chs, b)) {
            return true;
          }
        }
      }
    }
    return false;
  }

  private boolean checkPalindromeFormation(int start, int end, char[] a, String b) {
    for (int i = start; i < end; i++) {
      if (a[i] != b.charAt(i)) {
        return false;
      }
    }
    return true;
  }

  private boolean check(String str) {
    return new StringBuilder(str).reverse().toString().equals(str);
  }
}
