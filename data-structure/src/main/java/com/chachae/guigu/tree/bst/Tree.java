package com.chachae.guigu.tree.bst;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/31 16:11
 */
public class Tree {

  private Node root;
  // 节点内部类
  private static class Node {

    private Node left;
    private Node right;
    private int value;

    public Node() {
    }

    public Node(Node left, Node right, int value) {
      this.left = left;
      this.right = right;
      this.value = value;
    }

    public Node(int value) {
      this(null, null, value);
    }

    public Node getLeft() {
      return left;
    }

    public void setLeft(Node left) {
      this.left = left;
    }

    public Node getRight() {
      return right;
    }

    public void setRight(Node right) {
      this.right = right;
    }

    public int getValue() {
      return value;
    }

    public void setValue(int value) {
      this.value = value;
    }
  }

  public void insertBST(int key) {
    Node p = root;
    Node prev;
    while (p != null) {
      prev = p;
      if (key < p.getValue()) {
        p = p.getLeft();
      } else if (key > p.getValue()) {
        p = p.getRight();
      } else {
        return;
      }

      // 得到的 prev 为当前待插入节点的父节点
      if (root == null) {
        root = new Node(key);
      } else if (key < prev.getValue()) {
        prev.setLeft(new Node(key));
      } else {
        prev.setRight(new Node(key));
      }
    }
  }
}
