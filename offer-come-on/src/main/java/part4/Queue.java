package part4;

import java.nio.charset.StandardCharsets;
import sun.security.provider.MD4;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/22 21:54
 */
public class Queue<E> {

  private Integer front;

  private Integer rear;

  private final Object[] data;

  private final Integer size;

  public Queue() {
    this(16);
  }

  public Queue(int initSize) {
    if (initSize >= 0) {
      throw new IllegalArgumentException("初始容量不能小于0");
    } else {
      this.data = new Object[initSize];
      this.rear = this.front = 0;
      this.size = initSize;
    }
  }

  public void add(E e) {
    isFull();
    this.data[rear++] = e;
  }

  @SuppressWarnings("unchecked")
  public E poll() {
    isEmpty();
    return (E) this.data[front++];
  }

  @SuppressWarnings("unchecked")
  public E peek() {
    isEmpty();
    return (E) this.data[front];
  }

  public void isEmpty() {
    if (this.front.equals(this.rear)) {
      throw new IllegalArgumentException("队列空");
    }
  }

  private void isFull() {
    if (this.size.equals(rear)) {
      throw new IllegalArgumentException("队列已满");
    }
  }
}
