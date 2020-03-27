package com.chachae.example.syncContainer;

import com.chachae.annotations.NotThreadSafe;
import lombok.extern.slf4j.Slf4j;

import java.util.Iterator;
import java.util.Vector;

/**
 * 以下案例：不要在循环体中低集合进行删除操作！
 * 解决方案：再循环体中记录要删除的集合索引，循环结束再做删除
 *
 * @author chachae
 * @date 2019/11/5 9:31
 */
@Slf4j
@NotThreadSafe
public class VectorExample3 {

  /** foreach
   * 抛异常：java.util.ConcurrentModificationException
   * */
  public static void test1(Vector<Integer> v1) {
    for (Integer i : v1) {
      if (i.equals(3)) {
        v1.remove(i);
      }
    }
  }

  /** iterator
   * 抛异常：java.util.ConcurrentModificationException
   * */
  public static void test2(Vector<Integer> v1) {
    Iterator<Integer> iterator = v1.iterator();
    while (iterator.hasNext()) {
      Integer next = iterator.next();
      if (next.equals(3)) {
        v1.remove(next);
      }
    }
  }

  /** index for
   * 运行成功
   * */
  public static void test3(Vector<Integer> v1) {
    for (int i = 0; i < v1.size(); i++) {
      if (v1.get(i).equals(3)) {
        v1.remove(i);
      }
    }
  }

  public static void main(String[] args) {
    Vector<Integer> vector = new Vector<>();
    vector.add(1);
    vector.add(2);
    vector.add(3);
    // test1(vector);
    // test2(vector);
    test3(vector);
  }
}
