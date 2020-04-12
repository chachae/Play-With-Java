package com.chachae.bst;

import java.util.ArrayList;
import java.util.Random;

public class Main {


  public static void main(String[] args) {
    test();
  }

  private static void test() {
    BST<Integer> bst = new BST<>();
    int[] n = new int[]{4, 5, 0, 10, -4, 3};
    for (int i : n) {
      bst.add(i);
    }
    bst.preOrderNR();
  }

  private static void test2() {

    BST<Integer> bst = new BST<>();
    Random random = new Random();

    int n = 1000;

    // test removeMin
    for (int i = 0; i < n; i++) {
      bst.add(random.nextInt(10000));
    }

    ArrayList<Integer> nums = new ArrayList<>();
    while (!bst.isEmpty()) {
      nums.add(bst.removeMin());
    }

    System.out.println(nums);
    for (int i = 1; i < nums.size(); i++) {
      if (nums.get(i - 1) > nums.get(i)) {
        throw new IllegalArgumentException("Error!");
      }
    }
    System.out.println("removeMin test completed.");

    // test removeMax
    for (int i = 0; i < n; i++) {
      bst.add(random.nextInt(10000));
    }

    nums = new ArrayList<>();
    while (!bst.isEmpty()) {
      nums.add(bst.removeMax());
    }

    System.out.println(nums);
    for (int i = 1; i < nums.size(); i++) {
      if (nums.get(i - 1) < nums.get(i)) {
        throw new IllegalArgumentException("Error!");
      }
    }
    System.out.println("removeMax test completed.");
  }

}
