package com.chachae.algorithm.imooc.array;

/**
 * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/12 19:36
 */
public class LengthOfLongestSubstring {

  public static void main(String[] args) {
    String str = "akccbasww";
    System.out.println(new LengthOfLongestSubstring().lengthOfLongestSubstring(str));
  }

  public int lengthOfLongestSubstring(String s) {
    int[] freq = new int[256];
    int l = 0;
    int r = -1;
    int res = 0;
    while (l < s.length()) {
      if (r + 1 < s.length() && freq[s.charAt(r + 1)] == 0) {
        freq[s.charAt(++r)]++;
      } else {
        freq[s.charAt(l++)]--;
      }
      res = Math.max(res, r - l + 1);
    }
    return res;
  }

}
