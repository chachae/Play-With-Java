package com.chachae.jvm.d1;

/**
 * @author chachae
 * @since 2020/3/25 22:15
 */
public class MyObject {

  public static void main(String[] args) {

    Object obj = new Object();
    MyObject myObj = new MyObject();

    System.out.println(obj.getClass().getClassLoader());  // Bootstrap

    System.out.println(myObj.getClass().getClassLoader());  // application
    System.out.println(myObj.getClass().getClassLoader().getParent());  // ext
    System.out.println(myObj.getClass().getClassLoader().getParent().getParent());  // Bootstrap
  }
}
