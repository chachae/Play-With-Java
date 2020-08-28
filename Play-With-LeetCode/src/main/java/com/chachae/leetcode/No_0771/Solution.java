package com.chachae.leetcode.No_0771;

/**
 * https://leetcode-cn.com/problems/jewels-and-stones/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public int numJewelsInStones(String J, String S) {
    int res = 0;
    for (int i = 0; i < J.length(); i++) {
      for (int j = 0; j < S.length(); j++) {
        if (J.charAt(i) == S.charAt(j)) {
          res++;
        }
      }
    }
    return res;
  }
}