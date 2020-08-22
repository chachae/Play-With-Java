package com.chachae.algorithm.imooc.recursion_and_recall;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/21 12:18
 */
public class LetterCombinationsOfAPhoneNumber {

  private final List<String> res = new ArrayList<>();

  private final String[] dit = {" ", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

  private void findCombination(String digits, int index, String str) {
    if (index == digits.length()) {
      res.add(str);
      return;
    }

    char curBtn = digits.charAt(index);
    String query = dit[curBtn - '0'];
    for (int i = 0; i < query.length(); i++) {
      findCombination(digits, index + 1, str + query.charAt(i));
    }
  }

  public List<String> letterCombinations(String digits) {
    if (digits == null || digits.equals("")) {
      return res;
    }
    findCombination(digits, 0, "");
    return res;
  }

}
