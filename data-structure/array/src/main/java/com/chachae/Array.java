package com.chachae;

/**
 * 动态泛型数组
 *
 * @author chachae
 * @since 2020/4/7 16:03
 */
public class Array<E> {

  /** 长度 */
  private int size;

  /** 数组元素 */
  private E[] data;

  /**
   * 带参构造
   *
   * @param capacity 容量
   */
  public Array(int capacity) {
    size = 0;
    data = (E[]) new Object[capacity];
  }

  /** 默认无参构造 */
  public Array() {
    this(16);
  }

  /**
   * 数组长度
   *
   * @return 长度
   */
  public int getSize() {
    return size;
  }

  /**
   * 数组容量
   *
   * @return 容量
   */
  private int getCapacity() {
    return data.length;
  }

  /**
   * 在指定索引位置追加元素
   *
   * @param index 索引
   * @param e 元素
   */
  public void add(int index, E e) {
    // 判断索引是否非法
    if (index < 0) {
      throw new IllegalArgumentException("索引非法");
    }
    // 判断是否需要扩容
    ensureCapacity();
    System.arraycopy(data, index, data, index + 1, size - index);
    data[index] = e;
    size++;
  }

  /**
   * 数组末尾追加元素
   *
   * @param e 元素
   */
  public void add(E e) {
    add(size, e);
  }

  /**
   * 移除索引位置元素
   *
   * @param index 索引
   * @return 被移除值
   */
  public E remove(int index) {
    E e = get(index);
    if (e == null) {
      return null;
    } else {
      System.arraycopy(data, index + 1, data, index, size - index);
      size--;
      return e;
    }
  }

  /**
   * 更新索引值元素
   *
   * @param index 索引
   * @param e 新值
   * @return 旧值
   */
  public E update(int index, E e) {
    data[index] = e;
    return e;
  }

  /**
   * 获取索引对象
   *
   * @param index 索引
   * @return 索引对象
   */
  public E get(int index) {
    return data[index];
  }

  /**
   * 寻找元素索引位置
   *
   * @param e 元素
   * @return 索引位置
   */
  public int indexOf(E e) {
    for (int i = 0; i < data.length; i++) {
      if (data[i].equals(e)) {
        return i;
      }
    }
    return -1;
  }

  /** 判断是否需要增容/扩容 */
  private void ensureCapacity() {
    if (size == getCapacity()) {
      // 扩容
      resize();
    }
  }

  /** 扩容机制 */
  private void resize() {
    // 扩容两倍
    E[] es = (E[]) new Object[size << 1];
    System.arraycopy(data, 0, es, 0, size);
    data = es;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(String.format("Capacity:%d\nSize:%d\n", getCapacity(), size));
    for (E elem : data) {
      sb.append(elem).append(" ");
    }
    return sb.toString();
  }
}
