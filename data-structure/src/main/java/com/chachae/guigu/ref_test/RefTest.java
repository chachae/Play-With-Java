package com.chachae.guigu.ref_test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/29 21:24
 */
public class RefTest {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("asd");
    System.out.println(list.toString());

    List<String> ref = list;
    ref.remove("asd");
    System.out.println(ref.toString());
  }

}
