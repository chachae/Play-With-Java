package com.chachae.example.threadLocal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chachae
 * @date 2019/11/4 12:02
 */
@RestController
@RequestMapping("/threadLocal")
public class RequestHolderController {

  @GetMapping("/test")
  public Long test() {
    return RequestHolder.getId();
  }
}
