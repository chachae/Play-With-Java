package com.chachae;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试控制层
 *
 * @author chachae
 * @date 2019/9/6 10:57
 */
@RestController
@Slf4j
public class TestController {

  @GetMapping("/test")
  public String test() {
    return "test";
  }
}
