package chapter_4;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/31 16:11
 */
public class BST {

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

  public void deleteTree(int key) {
    deleteBST(root, key);
  }

  private boolean deleteBST(Node root, int key) {

    if (root == null) {
      return false;
    } else {
      if (key == root.getValue()) {
        return delete(root);
      } else if (key < root.getValue()) {
        return deleteBST(root.getLeft(), key);
      } else {
        return deleteBST(root.getRight(), key);
      }
    }
  }

  private boolean delete(Node node) {
    Node tmp;
    if (node.getRight() == null) {
      tmp = node;
      node = node.getLeft();
    } else if (node.getLeft() == null) {
      tmp = node;
      node = node.getRight();
    } else {
      tmp = node;
      Node s = node;
      s = s.getLeft();
      while (s.getRight() != null) {
        tmp = s;
        s = s.getRight();
      }
      node.setValue(s.getValue());
      if (tmp != node) {
        tmp.setRight(s.getLeft());
      } else {
        tmp.setLeft(s.getLeft());
      }
    }
    return true;
  }
}
