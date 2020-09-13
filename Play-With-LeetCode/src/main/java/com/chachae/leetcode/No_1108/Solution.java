package com.chachae.leetcode.No_1108;

/**
 * https://leetcode-cn.com/problems/defanging-an-ip-address/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public String defangIPaddr(String address) {
    StringBuilder ans = new StringBuilder();
    for (int i = 0; i < address.length(); i++) {
      char c = address.charAt(i);
      if (c == '.') {
        ans.append("[.]");
      } else {
        ans.append(c);
      }
    }
    return ans.toString();
  }
}