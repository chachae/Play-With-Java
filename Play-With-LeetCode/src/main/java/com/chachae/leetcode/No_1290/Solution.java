package com.chachae.leetcode.No_1290;

import com.chachae.leetcode.util.ListNode;

/**
 * https://leetcode-cn.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public int getDecimalValue(ListNode head) {
    int res = 0;
    while (head != null) {
      res = (res << 1) + head.val;
      head = head.next;
    }
    return res;
  }
}