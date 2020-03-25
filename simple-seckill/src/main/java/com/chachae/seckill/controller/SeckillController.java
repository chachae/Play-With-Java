package com.chachae.seckill.controller;

import cn.hutool.core.lang.Dict;
import com.chachae.seckill.base.Result;
import com.chachae.seckill.service.SeckillService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author chachae
 * @since 2020/3/23 19:53
 */
@RestController
@RequestMapping("/seckill")
public class SeckillController {

  private final SeckillService seckillService;

  public SeckillController(SeckillService seckillService) {
    this.seckillService = seckillService;
  }

  @GetMapping("/kill")
  public Result<Map<String, Object>> kill() {
    this.seckillService.kill();
    return Result.ok(Dict.create().set("剩余库存", this.seckillService.selectCount()));
  }
}
