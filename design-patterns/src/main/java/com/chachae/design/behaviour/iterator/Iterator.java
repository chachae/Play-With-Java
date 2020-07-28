package com.chachae.design.behaviour.iterator;

/**
 * 迭代器接口
 *
 * @author chachae
 * @version v1.0
 * @date 2020/7/28 21:40
 */
public interface Iterator {

  /**
   * 前一个元素
   */
  Object previous();

  /**
   * 下一个元素
   */
  Object next();

  /**
   * 判断是和否存在下一个元素
   */
  boolean hasNext();

}
