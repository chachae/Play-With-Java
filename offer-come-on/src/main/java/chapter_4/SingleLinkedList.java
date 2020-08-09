package chapter_4;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/31 11:40
 */
public class SingleLinkedList<E> {

  private final Node dummyHead;
  private int length;

  private class Node {

    private final E data;
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

  public SingleLinkedList() {
    dummyHead = new Node(null);
    length = 0;
  }

  public void add(E data) {
    add(0, data);
  }

  public void addLast(E data) {
    add(length - 1, data);
  }

  public E removeFirst() {
    return remove(0);
  }

  public E removeLast() {
    return remove(length - 1);
  }

  private E remove(int index) {
    isErrIndex(index);
    Node prev = this.dummyHead;
    for (int i = 0; i < index; i++) {
      prev = prev.next;
    }
    Node removedNode = prev.next;
    prev.next = removedNode.next;
    length--;
    return removedNode.data;
  }

  private void add(int index, E data) {
    isErrIndex(index);
    Node prev = this.dummyHead.next;
    for (int i = 0; i < index; i++) {
      prev = prev.next;
    }
    Node newNode = new Node(data);
    newNode.next = prev.next;
    prev.next = newNode;
    length++;
  }

  private void isErrIndex(int index) {
    if (index < 0 || index > length) {
      throw new IllegalArgumentException("索引非法");
    }
  }
}
