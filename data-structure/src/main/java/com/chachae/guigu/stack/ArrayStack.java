package com.chachae.guigu.stack;

/**
 * 数组栈
 *
 * @author chachae
 * @version v1.0
 * @date 2020/7/31 21:41
 */
public class ArrayStack<E> {

  private E[] data;
  private int size;
  private int top;

  @SuppressWarnings("unchecked")
  public ArrayStack(int initSize) {
    this.data = (E[]) new Object[initSize];
    this.size = initSize;
    top = -1;
  }

  public ArrayStack() {
    this(10);
  }

  public E peek() {
    isEmpty();
    return this.data[top];
  }

  public E pop() {
    isEmpty();
    return this.data[top--];
  }

  public boolean push(E element) {
    checkSize();
    this.data[++top] = element;
    return true;
  }

  @SuppressWarnings("unchecked")
  private void resize(int type) {
    size = type == 1 ? this.size * 2 : this.size / 2;
    E[] newData = (E[]) new Object[size];
    System.arraycopy(this.data, 0, newData, 0, top + 1);
    this.data = newData;
  }

  private void checkSize() {
    if (this.size - 1 == top) {
      // 扩容
      resize(1);
    } else if (this.size >> 1 > (top + 1) && top != -1) {
      // 缩容
      resize(0);
    }
  }

  private void isEmpty() {
    if (this.size == 0) {
      throw new IllegalArgumentException("栈空");
    }
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder().append("[tail]");
    for (int i = 0; i <= top; i++) {
      sb.append(String.format(" %s ", this.data[i]));
      if (i != top) {
        sb.append("->");
      }
    }
    sb.append("[head]");
    return sb.toString();
  }
}
