package com.chachae.leetcode.Interview_0809;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/bracket-lcci/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/26 11:10
 */
class Solution {
  /*
      解答
      1、回溯算法
      2、()需要配对
  */
  List<String> ans;
  public List<String> generateParenthesis(int n) {
    ans = new ArrayList<>();
    char[] cs = new char[n * 2];
    dfs(cs, 0, n, n);
    return ans;
  }
  public void dfs(char[] cs, int k, int leftCnt, int rightCnt){
    if(leftCnt == 0 && rightCnt == 0){
      ans.add(new String(cs));
      return ;
    }

    if(leftCnt > 0){
      cs[k] = '(';
      dfs(cs, k + 1, leftCnt - 1, rightCnt);
    }

    if(rightCnt > 0 && rightCnt > leftCnt){//右边')'必须有足够的'('匹配
      cs[k] = ')';
      dfs(cs, k + 1, leftCnt, rightCnt - 1);
    }

  }
}