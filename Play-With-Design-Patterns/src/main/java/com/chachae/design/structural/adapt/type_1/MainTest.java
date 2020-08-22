package com.chachae.design.structural.adapt.type_1;

/**
 * 适配器模式（类适配）
 *
 * @author chachae
 * @version v1.0
 * @date 2020/7/24 10:40
 */
public class MainTest {

  public static void main(String[] args) {
    Adapt adapt = new Adapt();
    adapt.editWordFile();
    adapt.editTextFile();
  }
}
