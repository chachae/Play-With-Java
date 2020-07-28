package com.chachae.design.structural.proxy;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/24 11:54
 */
public class HR implements Company {

  @Override
  public void findWork(String title) {
    System.out.println("I need worder,title is:" + title);
  }
}
