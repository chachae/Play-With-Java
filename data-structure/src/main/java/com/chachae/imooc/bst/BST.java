package com.chachae.imooc.bst;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 二分搜索树
 *
 * @author chachae
 * @since 2020/4/10 10:34
 */
public class BST<E extends Comparable<E>> {

  private class Node {

    public E e;
    public Node left, right;

    public Node(E e) {
      this.e = e;
      left = null;
      right = null;
    }
  }

  private Node root;
  private int size;

  public BST() {
    root = null;
    size = 0;
  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return size == 0;
  }


  /**
   * 向二分搜索树中添加新的元素e
   *
   * @param e 插入元素
   */
  public void add(E e) {
    root = add(root, e);
  }

  /**
   * 向以node为根的二分搜索树中插入元素e，递归算法 返回插入新节点后二分搜索树的根
   *
   * @param node 节点
   * @param e    插入元素
   * @return 新节点
   */
  private Node add(Node node, E e) {
    if (node == null) {
      size++;
      return new Node(e);
    }

    if (e.compareTo(node.e) < 0) {
      node.left = add(node.left, e);
    } else if (e.compareTo(node.e) > 0) {
      node.right = add(node.right, e);
    }

    return node;
  }

  public boolean contains(E e) {
    return contains(root, e);
  }

  private boolean contains(Node node, E e) {
    if (node == null) {
      return false;
    }

    if (e.compareTo(node.e) == 0) {
      return true;
    } else if (e.compareTo(node.e) < 0) {
      return contains(node.left, e);
    } else {
      return contains(node.right, e);
    }
  }

  /**
   * 前序遍历
   */
  public void preOrder() {
    preOrder(root);
  }

  private void preOrder(Node node) {
    if (node != null) {
      System.out.printf("%s\t", node.e);
      preOrder(node.left);
      preOrder(node.right);
    }
  }

  /**
   * 前序遍历（非递归方法）
   */
  public void preOrderNR() {
    Stack<Node> stack = new Stack<>();
    stack.push(root);
    while (!stack.isEmpty()) {
      Node cur = stack.pop();
      System.out.printf("%s\t", cur.e);
      if (cur.right != null) {
        stack.push(cur.right);
      }
      if (cur.left != null) {
        stack.push(cur.left);
      }
    }
  }

  /**
   * 中序遍历
   */
  public void inOrder() {
    inOrder(root);
  }

  private void inOrder(Node node) {
    if (node != null) {
      inOrder(node.left);
      System.out.printf("%s\t", node.e);
      inOrder(node.right);
    }
  }

  /**
   * 后序遍历
   */
  public void postOrder() {
    postOrder(root);
  }

  private void postOrder(Node node) {
    if (node != null) {
      postOrder(node.left);
      postOrder(node.right);
      System.out.printf("%s\t", node.e);
    }
  }

  /**
   * 层序遍历（广度优先）
   */
  public void levelOrder() {
    Queue<Node> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      Node cur = queue.remove();
      System.out.printf("%s\t", cur.e);
      if (cur.left != null) {
        queue.add(cur.left);
      }
      if (cur.right != null) {
        queue.add(cur.right);
      }
    }
  }

  /**
   * 寻找最小元素
   *
   * @return E
   */
  public E minimum() {
    return minimum(root).e;
  }

  private Node minimum(Node node) {
    if (node == null) {
      throw new IllegalArgumentException("BST is empty!");
    }
    return node.left == null ? node : minimum(node.left);
  }

  /**
   * 寻找最大元素
   *
   * @return E
   */
  public E maximum() {
    return maximum(root).e;
  }

  private Node maximum(Node node) {
    if (node == null) {
      throw new IllegalArgumentException("BST is empty!");
    }
    return node.right == null ? node : maximum(node.right);
  }

  /**
   * 非递归查找最大值算法
   */
  private Node maximumNR(Node node) {
    if (node == null) {
      throw new IllegalArgumentException("BST is empty!");
    }
    while (node.right != null) {
      node = node.right;
    }
    return node;
  }

  /**
   * 移除最小值
   *
   * @return 最小值
   */
  public E removeMin() {
    E min = minimum();
    root = removeMin(root);
    return min;
  }

  private Node removeMin(Node node) {

    if (node.left == null) {
      Node right = node.right;
      node.right = null;
      size--;
      return right;
    }

    node.left = removeMin(node.left);
    return node;
  }

  /**
   * 移除最大值
   *
   * @return 最大值
   */
  public E removeMax() {
    E min = maximum();
    root = removeMax(root);
    return min;
  }

  private Node removeMax(Node node) {

    if (node.right == null) {
      Node left = node.left;
      node.left = null;
      size--;
      return left;
    }

    node.right = removeMin(node.right);
    return node;
  }

  // 从二分搜索树中删除元素为e的节点
  public void remove(E e) {
    root = remove(root, e);
  }

  // 删除掉以node为根的二分搜索树中值为e的节点, 递归算法
  // 返回删除节点后新的二分搜索树的根
  private Node remove(Node node, E e) {

    if (node == null) {
      return null;
    }

    if (e.compareTo(node.e) < 0) {
      node.left = remove(node.left, e);
      return node;
    } else if (e.compareTo(node.e) > 0) {
      node.right = remove(node.right, e);
      return node;
    } else {   // e.compareTo(node.e) == 0

      // 待删除节点左子树为空的情况
      if (node.left == null) {
        Node rightNode = node.right;
        node.right = null;
        size--;
        return rightNode;
      }

      // 待删除节点右子树为空的情况
      if (node.right == null) {
        Node leftNode = node.left;
        node.left = null;
        size--;
        return leftNode;
      }

      // 待删除节点左右子树均不为空的情况

      // 找到比待删除节点大的最小节点, 即待删除节点右子树的最小节点
      // 用这个节点顶替待删除节点的位置
      Node successor = minimum(node.right);
      successor.right = removeMin(node.right);
      successor.left = node.left;

      node.left = node.right = null;

      return successor;
    }
  }

  @Override
  public String toString() {
    StringBuilder res = new StringBuilder();
    generateBstString(root, 0, res);
    return res.toString();
  }

  // 生成以node为根节点，深度为depth的描述二叉树的字符串
  private void generateBstString(Node node, int depth, StringBuilder res) {

    if (node == null) {
      res.append(generateDepthString(depth)).append("null\n");
      return;
    }

    res.append(generateDepthString(depth)).append(node.e).append("\n");
    generateBstString(node.left, depth + 1, res);
    generateBstString(node.right, depth + 1, res);
  }

  private String generateDepthString(int depth) {
    StringBuilder res = new StringBuilder();
    for (int i = 0; i < depth; i++) {
      res.append("--");
    }
    return res.toString();
  }
}
