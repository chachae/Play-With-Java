package com.chachae.example.publish;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author chachae
 * @date 2019/9/27 10:02
 */
@Slf4j
public class UnSafePublish {

  private String[] str = {"a", "b", "c"};

  private String[] getStr() {
    return str;
  }

  @Test
  public void test1() {

    UnSafePublish unSafePublish = new UnSafePublish();

    log.info("{}", Arrays.toString(unSafePublish.getStr()));
    // 可以修改私有属性
    unSafePublish.getStr()[0] = "d";
    log.info("{}", Arrays.toString(unSafePublish.getStr()));
  }
}
