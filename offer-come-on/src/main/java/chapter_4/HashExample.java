package chapter_4;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/31 16:03
 */
public class HashExample {

  int hash = 0;
  char[] value = {'h', 'e', 'l', 'l', 'o'};

//  public int hashCode() {
//    int h = hash;
//    if (h == 0 && value.length > 0) {
//      char[] val = value;
//      for (int i = 0; i < value.length; i++) {
//        h = 31 * h + val[i];
//      }
//      hash = h;
//    }
//    return hash;
//  }

  public static void main(String[] args) {
    System.out.println(new HashExample().hashCode());
  }

}
