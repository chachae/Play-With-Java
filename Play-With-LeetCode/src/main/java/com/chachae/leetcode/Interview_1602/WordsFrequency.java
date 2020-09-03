package com.chachae.leetcode.Interview_1602;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/words-frequency-lcci/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/26 11:10
 */
class WordsFrequency {

  private final Map<String, Integer> map = new HashMap<>();

  public WordsFrequency(String[] book) {
    for (String s : book) {
      map.put(s, map.getOrDefault(s, 0) + 1);
    }
  }

  public int get(String word) {
    return map.getOrDefault(word, 0);
  }
}
