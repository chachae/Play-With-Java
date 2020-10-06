package com.chachae.lanqiao.groupb_2015;

/**
 *
 * @author chachae
 * @date 2020/10/6 15:25
 * @version v1.0
 */
public class No03 {

  public static void main(String[] args) {
    for (int a = 0; a <= 9; a++) {
      for (int b = 0; b <= 9; b++) {
        if (a != b) {
          for (int c = 0; c <= 9; c++) {
            if (a != c && b != c) {
              for (int d = 0; d <= 9; d++) {
                if (a != d && b != d && c != d) {
                  for (int e = 0; e <= 9; e++) {
                    if (a != e && b != e && c != e && d != e) {
                      for (int f = 0; f <= 9; f++) {
                        if (a != f && b != f && c != f && d != f && e != f) {
                          for (int g = 0; g <= 9; g++) {
                            if (a != g && b != g && c != g && d != g && e != g && f != g) {
                              for (int h = 0; h <= 9; h++) {
                                String n1 = "" + a + b + c + d;
                                if (b == h) {
                                  String n2 = "" + e + f + g + h;
                                  int q = Integer.parseInt(n1);
                                  int w = Integer.parseInt(n2);
                                  int sum = q + w;
                                  String mb = String.valueOf(sum);
                                  if (mb.length() == 5) {
                                    if ((mb.charAt(0) + "").equals(String.valueOf(e))) {
                                      if ((mb.charAt(1) + "").equals(String.valueOf(f))) {
                                        if ((mb.charAt(2) + "").equals(String.valueOf(c))) {
                                          if ((mb.charAt(3) + "").equals(String.valueOf(b))) {
                                            if (e != f) {
                                              String end = mb.charAt(4) + "";
                                              String t = "" + a + b + c + d + e + f + g + h;
                                              if (!t.contains(end)) {
                                                System.out.printf("祥 : %s 瑞 : %s 生 : %s 辉 : %s %n", a, b, c, d);
                                                System.out.printf("三 : %s 羊 : %s 献 : %s 瑞 : %s %n", e, f, g, b);
                                                System.out.println("____________________________________");
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}
