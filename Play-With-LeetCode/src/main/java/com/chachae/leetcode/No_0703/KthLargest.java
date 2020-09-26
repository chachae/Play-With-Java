package com.chachae.leetcode.No_0703;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/kth-largest-element-in-a-stream/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class KthLargest {

  private int[] record;
  private final int no;
  private int len;

  public KthLargest(int k, int[] nums) {
    this.no = k;
    this.record = nums;
    this.len = nums.length;
  }

  public int add(int val) {
    addAndSort(val);
    return this.record[len - no];
  }

  private void addAndSort(int val) {
    int[] newRecord = new int[++len];
    System.arraycopy(record, 0, newRecord, 0, record.length);
    newRecord[len - 1] = val;
    Arrays.sort(newRecord);
    this.record = newRecord;
  }
}