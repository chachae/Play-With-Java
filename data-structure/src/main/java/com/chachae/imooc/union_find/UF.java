package com.chachae.imooc.union_find;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/8/8 14:47
 */
public interface UF {

  int getSize();

  /**
   * 是否相连
   */
  boolean isConnected(int p, int q);

  /**
   * 合并元素
   */
  void unionElements(int p, int q);
}
