package com.chachae.lanqiao.acwing;

import java.util.Scanner;

/**
 *
 * @author chachae
 * @date 2020/10/16 16:06
 * @version v1.0
 */
public class Acwing1224 {

  static int count = 0;//计数

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int start = 0; //记录未排好序的瓶子起始位置
    int N = scanner.nextInt();
    int[] numOfBottle = new int[N];
    for (int i = 0; i < N; i++) {
      numOfBottle[i] = scanner.nextInt();
    }
    scanner.close();
    int time = 0;
    while (start != numOfBottle.length) {
      if (numOfBottle[time] == time + 1) {
        //若瓶子就在正确位置
        start++;
        time++;
      } else {
        //需要交换
        change(numOfBottle, start, findMin(numOfBottle, start));
        time++;
        start++;
      }
    }
    System.out.println(count);
  }

  //知道未排序瓶子中最小的序号，可以全部遍历找最小的，也可以查找值等于待排序start+1的下标，这个会更节省时间一些
  //也可以用map存贮，查找会更方便，但是交换顺序不如数组方便
  public static int findMin(int a[], int start) {
    int min = 10000;
    int position = 10000;
    for (int i = start; i < a.length; i++) {
      if (a[i] < min) {
        min = a[i];
        position = i;
      }
    }
    return position;//返回下标

  }

  //交换位置
  public static void change(int a[], int key, int value) {
    int temp;
    temp = a[value];
    a[value] = a[key];
    a[key] = temp;
    count++;//每交换一次，次数加一
  }
}
