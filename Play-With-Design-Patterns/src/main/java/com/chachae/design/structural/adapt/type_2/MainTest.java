package com.chachae.design.structural.adapt.type_2;

import com.chachae.design.structural.adapt.Source;

/**
 * 适配器模式（对象适配）
 *
 * @author chachae
 * @version v1.0
 * @date 2020/7/24 10:40
 */
public class MainTest {

  public static void main(String[] args) {
    ObjectAdapt adapt = new ObjectAdapt(new Source());
    adapt.editTextFile();
    adapt.editWordFile();
  }
}
