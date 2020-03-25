package com.chachae.seckill.job;

import cn.hutool.log.Log;
import com.chachae.seckill.service.SeckillService;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * 定时任务，库存0 的时候增加200 个库存（每秒检测一次）
 *
 * @author chachae
 * @since 2020/3/25 11:10
 */
@Configuration
public class UpdateStockJob {

  private final SeckillService seckillService;

  public UpdateStockJob(SeckillService seckillService) {
    this.seckillService = seckillService;
  }

  private Log log = Log.get();

  @Scheduled(cron = "0/1 * * * * ? ")
  public void add() {
    if (seckillService.selectCount() == 0) {
      seckillService.update(200);
      log.info("更新库存");
    }
  }
}
