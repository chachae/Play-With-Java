package com.chachae.example.publish;

import com.chachae.annoations.NotRecommend;
import com.chachae.annoations.NotThreadSafe;
import lombok.extern.slf4j.Slf4j;

/**
 * 对象未完成构造之前，不可以将其发布，会造成this引用溢出
 *
 * @author chachae
 * @date 2019/9/27 10:13
 */
@Slf4j
@NotRecommend
@NotThreadSafe
public class Escape {

  private int thisCanBeEscape = 0;

  /**
   * 未完成构造
   */
  private Escape() {
    new InnerClass();
  }

  private class InnerClass {
    InnerClass() {
      log.info("{}", Escape.this.thisCanBeEscape);
    }
  }

  public static void main(String[] args) {
    new Escape();
  }
}
