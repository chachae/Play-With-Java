package com.chachae.seckill.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 秒杀页面
 *
 * @author chachae
 * @since 2020/3/23 18:15
 */
@Controller
@RequestMapping("/index")
public class MainController {

  @GetMapping
  public String index() {
    return "views/index";
  }
}
