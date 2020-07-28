package part4;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/20 10:53
 */
public class Stack<E> {

  private int size;

  private Object[] data;

  private Integer top;

  public Stack(int initialSize) {
    if (initialSize < 0) {
      throw new IllegalArgumentException("初始化容量不能小于0");
    } else {
      this.size = initialSize;
      this.data = new Object[initialSize];
      this.top = -1;
    }
  }

  public Stack() {
    this(10);
  }

  public void push(E e) {
    if (top + 1 == size) {
      throw new IllegalArgumentException("容量已满");
    } else {
      data[++top] = e;
    }
  }

  @SuppressWarnings("unchecked")
  public E peek() {
    isEmpty();
    return (E) data[top];
  }

  @SuppressWarnings("unchecked")
  public E pop() {
    isEmpty();
    return (E) data[top--];
  }

  private void isEmpty() {
    if (top == -1) {
      throw new IllegalArgumentException("栈空！");
    }
  }

  public static void main(String[] args) {
    Stack<String> ts = new Stack<>();
    ts.push("a");
    ts.push("b");
    ts.push("c");
    ts.push("d");
    System.out.println(ts.peek());
    ts.pop();
    ts.pop();
    System.out.println(ts.peek());
  }
}
