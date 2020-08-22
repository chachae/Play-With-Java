package com.chachae.imooc.collection.map;

/**
 * @author chachae
 * @since 2020/4/12 11:30
 */
public class LinkedListMap<K, V> implements Map<K, V> {

  private class Node {

    public K key;
    public V value;
    public Node next;

    public Node(K key, V value, Node next) {
      this.key = key;
      this.value = value;
      this.next = next;
    }

    public Node(K key, V value) {
      this(key, value, null);
    }

    public Node() {
      this(null, null, null);
    }

    @Override
    public String toString() {
      return key.toString() + " : " + value.toString();
    }
  }

  private Node dummyHead;
  private int size;

  public LinkedListMap() {
    dummyHead = new Node();
    size = 0;
  }

  private Node getNode(K key) {
    Node cur = dummyHead.next;
    while (cur != null) {
      if (cur.key.equals(key)) {
        return cur.next;
      }
      cur = cur.next;
    }
    return null;
  }

  @Override
  public void add(K key, V value) {
    Node node = getNode(key);
    if (node == null) {
      dummyHead.next = new Node(key, value, dummyHead.next);
      size++;
    } else {
      node.value = value;
    }
  }

  @Override
  public V remove(K key) {
    Node prev = dummyHead;
    while (prev.next != null) {
      if (prev.next.key.equals(key)) {
        break;
      }
      prev = prev.next;
    }

    if (prev.next != null) {
      Node del = prev.next;
      prev.next = del.next;
      del.next = null;
      size--;
      return del.value;
    }

    return null;
  }

  @Override
  public boolean contains(K key) {
    return getNode(key) != null;
  }

  @Override
  public V get(K key) {
    Node node = getNode(key);
    return node == null ? null : node.value;
  }

  @Override
  public void set(K key, V newValue) {
    Node node = getNode(key);
    if (node == null) {
      throw new IllegalArgumentException("节点不存在");
    }
    node.value = newValue;
  }

  @Override
  public int getSize() {
    return size;
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

}
