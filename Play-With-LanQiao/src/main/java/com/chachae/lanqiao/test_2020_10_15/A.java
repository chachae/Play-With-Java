package com.chachae.lanqiao.test_2020_10_15;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author chachae
 * @date 2020/10/15 18:29
 * @version v1.0
 */
public class A {

  public static void main(String[] args) {
    Map<Character, Character> dts = new HashMap<>();
    dts.put('y', 'a');
    dts.put('Y', 'A');
    dts.put('x', 'b');
    dts.put('X', 'B');
    dts.put('m', 'c');
    dts.put('M', 'C');
    dts.put('d', 'd');
    dts.put('D', 'D');
    dts.put('a', 'e');
    dts.put('A', 'E');
    dts.put('c', 'f');
    dts.put('C', 'F');
    dts.put('i', 'g');
    dts.put('I', 'G');
    dts.put('k', 'h');
    dts.put('K', 'H');
    dts.put('n', 'i');
    dts.put('N', 'I');
    dts.put('t', 'j');
    dts.put('T', 'J');
    dts.put('j', 'k');
    dts.put('J', 'K');
    dts.put('h', 'l');
    dts.put('H', 'L');
    dts.put('q', 'm');
    dts.put('Q', 'M');
    dts.put('l', 'n');
    dts.put('L', 'N');
    dts.put('g', 'o');
    dts.put('G', 'O');
    dts.put('o', 'p');
    dts.put('O', 'P');
    dts.put('u', 'q');
    dts.put('U', 'Q');
    dts.put('f', 'r');
    dts.put('F', 'R');
    dts.put('s', 's');
    dts.put('S', 'S');
    dts.put('z', 't');
    dts.put('Z', 'T');
    dts.put('p', 'u');
    dts.put('P', 'U');
    dts.put('w', 'v');
    dts.put('W', 'V');
    dts.put('b', 'w');
    dts.put('B', 'W');
    dts.put('r', 'x');
    dts.put('R', 'X');
    dts.put('e', 'y');
    dts.put('E', 'Y');
    dts.put('v', 'z');
    dts.put('V', 'Z');
    StringBuilder ans = new StringBuilder();
    String str = "EaFnjISplhFviDhwFbEjRjfIBBkRyY";
    for (char ch : str.toCharArray()) {
      ans.append(dts.get(ch));
    }
    System.out.println(ans.toString());
  }
}
