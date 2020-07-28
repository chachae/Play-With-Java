package com.chachae.design.structural.adapt.type_3;

/**
 * 适配器模式（接口适配）
 *
 * @author chachae
 * @version v1.0
 * @date 2020/7/24 10:40
 */
public class MainTest {

  public static void main(String[] args) {
    TextSub textSub = new TextSub();
    WordSub wordSub = new WordSub();
    textSub.editTextFile();
    wordSub.editWordFile();
  }
}
