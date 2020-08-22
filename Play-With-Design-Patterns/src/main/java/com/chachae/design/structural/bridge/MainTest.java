package com.chachae.design.structural.bridge;

/**
 * 桥接模式（参考 jdbc driver）
 *
 * @author chachae
 * @version v1.0
 * @date 2020/7/24 10:40
 */
public class MainTest {

  public static void main(String[] args) {
    DriverMangerBridge bridge = new MyDriverBridge();

    // mysql
    bridge.setDriver(new MySqlDriver());
    bridge.execute();

    // oracle
    bridge.setDriver(new OracleDriver());
    bridge.execute();
  }
}
