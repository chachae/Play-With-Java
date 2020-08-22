package com.chachae.design.structural.bridge;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/24 15:29
 */
public class MySqlDriver implements Driver {

  @Override
  public void executeSQL() {
    System.out.println("execute sql by mysql");
  }
}
