package com.chachae.interview.safe;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @author chachae
 * @since 2020/3/22 16:13
 */
public class UnmodifiableDemo {

  /** Collections 初始化不可变对象 */
  @Test
  public void test() {

    // 不可变Map，并使用双括弧方式初始化
    Map<String, Object> map =
        Collections.unmodifiableMap(
            new HashMap<String, Object>(1) {
              {
                put("a", 1);
              }
            });
    System.out.println(map);

    // 不可变List，并使用双括弧方式初始化
    List<Integer> list =
        Collections.unmodifiableList(
            new ArrayList<Integer>() {
              {
                add(1);
              }
            });

    System.out.println(list);
  }

  /** Guava 不可变对象（推荐） */
  @Test
  public void test2() {

    ImmutableMap<Object, Object> map = ImmutableMap.builder().put("a", 1).put("b", 2).build();
    System.out.println(map);

    ImmutableMap<String, Integer> map2 = ImmutableMap.of("a", 1, "b", 2);
    System.out.println(map2);

    ImmutableList<Object> list = ImmutableList.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    System.out.println(list);
  }
}
