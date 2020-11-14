package com.chachae.java.collection.equals_symbol;

/**
 *
 * @author chachae
 * @date 2020/10/31 11:11
 * @version v1.0
 */
public class Demo {

  public static void main(String[] args) {

    String s1 = new String("1");
    String s2 = new String("1");
    String s3 = "1";
    String s4 = "1";

    System.out.println(s1==s2); // false
    System.out.println(s3==s4); // true
    System.out.println(s1.equals(s2)); // true
    System.out.println(s3.equals(s4)); // true
    System.out.println(42 == 42.0); // true
  }

}
