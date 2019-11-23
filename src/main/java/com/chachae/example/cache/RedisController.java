package com.chachae.example.cache;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author chachae
 * @date 2019/11/23 10:46
 */
@RestController
@RequestMapping("redis")
public class RedisController {

  @Resource RedisUtil redisUtil;

  @GetMapping("set")
  public ResponseEntity set(@RequestParam("key") String k, @RequestParam("value") String v) {
    redisUtil.set(k, v);
    return ResponseEntity.status(HttpStatus.OK).body("success");
  }

  @GetMapping("get")
  public ResponseEntity get(@RequestParam("key") String k) {
    String v = redisUtil.get(k);
    return ResponseEntity.status(HttpStatus.OK).body(v);
  }
}
