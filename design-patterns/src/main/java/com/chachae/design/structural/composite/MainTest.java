package com.chachae.design.structural.composite;

import cn.hutool.json.JSONUtil;

/**
 * 组合模式
 *
 * @author chachae
 * @version v1.0
 * @date 2020/7/24 10:40
 */
public class MainTest {

  public static void main(String[] args) {
    TreeNode t1 = new TreeNode("Mike", "10");
    TreeNode t2 = new TreeNode("Sue", "20");
    t1.add(t2);
    System.out.println(JSONUtil.toJsonStr(t1));
  }
}
