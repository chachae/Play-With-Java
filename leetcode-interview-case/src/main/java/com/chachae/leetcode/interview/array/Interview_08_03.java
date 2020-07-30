package com.chachae.leetcode.interview.array;

/**
 * <a href="https://leetcode-cn.com/problems/magic-index-lcci/">面试题 08.03. 魔术索引</a>
 *
 * @author chachae
 * @version v1.0
 * @date 2020/7/29 23:12
 */
public class Interview_08_03 {

  public static void main(String[] args) {
    int[] nums = {0, 0, 2};
    System.out.println(new Interview_08_03().findMagicIndex(nums));
  }

  public int findMagicIndex(int[] nums) {
    int index = -1;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == i) {
        index = i;
        break;
      }
    }
    return index;
  }
}
