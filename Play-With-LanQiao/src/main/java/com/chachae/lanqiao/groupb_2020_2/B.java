package com.chachae.lanqiao.groupb_2020_2;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class B {

  private static final int[][] records = new int[300][300];
  private static int ans = 0;
  private static final String filePath = "/Users/chachae/codes/Java/git/Play-With-Java/Play-With-LanQiao/src/main/java/com/chachae/lanqiao/groupb_2020/2020.txt";

  public static void main(String[] args) throws Exception {
    FileInputStream fis = new FileInputStream(new File(filePath));
    byte[] allocateBytes = new byte[300 * 300 + 2 * 300];
    fis.read(allocateBytes);
    fis.close();
    int count = 0;
    List<Integer> mdList = new ArrayList<>(300 * 300);
    for (byte b : allocateBytes) {
      if (b - '0' != -35 && b - '0' != -38) {
        mdList.add(b - '0');
        ++count;
      }
    }
    for (int i = 0, idx = -1; i < 300; ++i) {
      for (int j = 0; j < 300; ++j) {
        records[i][j] = mdList.get(++idx);
      }
    }

    for (int i = 0; i < 300; ++i) {
      for (int j = 0; j < 300; ++j) {
        calc(records[i][j], i, j);
      }
    }
    System.out.printf("matrix nums : %s%nresult : %s", count, ans);
  }

  private static void calc(int n, int i, int j) {
    if (n == 2 && i + 1 < 300 && i + 2 < 300 && i + 3 < 300
        && records[i + 1][j] == 0 && records[i + 2][j] == 2
        && records[i + 3][j] == 0) {
      ++ans;
    }
    if (n == 2 && j + 1 < 300 && j + 2 < 300 && j + 3 < 300
        && records[i][j + 1] == 0 && records[i][j + 2] == 2
        && records[i][j + 3] == 0) {
      ++ans;
    }
    if (n == 2 && i + 1 < 300 && i + 2 < 300 && i + 3 < 300 && j + 1 < 300
        && j + 2 < 300 && j + 3 < 300 && records[i + 1][j + 1] == 0
        && records[i + 2][j + 2] == 2 && records[i + 3][j + 3] == 0) {
      ++ans;
    }
  }
}
