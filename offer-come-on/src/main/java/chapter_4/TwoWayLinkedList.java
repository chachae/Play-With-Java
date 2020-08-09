package chapter_4;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/31 11:40
 */
public class TwoWayLinkedList<E> {

  // 头
  private Node head;
  // 尾
  private Node tail;
  // 链表长度
  private int length;

  private class Node {

    private final E data;
    private Node pre;
    private Node next;

    public Node(E data) {
      this.data = data;
    }

    @Override
    public String toString() {
      return "Node{" +
          "data=" + data +
          '}';
    }
  }

  public TwoWayLinkedList() {
    length = 0;
    head = null;
    tail = null;
  }

  // 头部增加
  public void addHead(E data) {
    Node newNode = new Node(data);
    if (length == 0) {
      head = tail = newNode;
    } else {
      head.pre = newNode;
      newNode.next = head;
      head = newNode;
    }
    length++;
  }

  // 尾部增加
  public void addTail(E data) {
    Node newNode = new Node(data);
    if (length == 0) {
      head = tail = newNode;
    } else {
      newNode.pre = tail;
      tail.next = newNode;
      tail = newNode;
    }
    length++;
  }

  public Node deleteHead() {
    Node tmp = head;
    if (length != 0) {
      head = head.next;
      head.pre = null;
      length--;
      return tmp;
    } else {
      return null;
    }
  }

  public Node deleteTail() {
    Node tmp = tail;
    if (length != 0) {
      tail = tail.pre;
      tail.next = null;
      length--;
      return tmp;
    } else {
      return null;
    }
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    TwoWayLinkedList<E> list = this;
    while (list.head != null) {
      sb.append(list.head);
      if (list.head.next != null) {
        sb.append(" -> ");
      }
      list.head = list.head.next;
    }
    return sb.toString();
  }

}
