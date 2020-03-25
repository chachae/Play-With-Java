package com.chachae.seckill.service.impl;

import cn.hutool.log.Log;
import com.chachae.seckill.domain.SeckillStateEnum;
import com.chachae.seckill.exception.ServiceException;
import com.chachae.seckill.repository.SeckillDAO;
import com.chachae.seckill.service.SeckillService;
import org.springframework.stereotype.Service;

import java.util.concurrent.Semaphore;

/**
 * @author chachae
 * @since 2020/3/23 20:37
 */
@Service
public class SeckillServiceImpl implements SeckillService {

  private final SeckillDAO seckillDAO;

  public SeckillServiceImpl(SeckillDAO seckillDAO) {
    this.seckillDAO = seckillDAO;
  }

  private Log log = Log.get();

  /** 信号量 - 200 */
  private static Semaphore semaphore = new Semaphore(200);

  @Override
  public Integer kill() {
    try {
      semaphore.acquire();
      main();
      return 1;
    } catch (InterruptedException e) {
      throw new ServiceException(SeckillStateEnum.FAIL.getDesc());
    } finally {
      semaphore.release();
    }
  }

  private void main() {
    // 执行秒杀
    if (seckillDAO.getCount() > 0) {
      this.seckillDAO.remove();
      log.info(
          "线程：{}，秒杀成功，剩余库存:[{}]", Thread.currentThread().getName(), this.seckillDAO.getCount());
    } else {
      log.info("线程：{}，秒杀失败", Thread.currentThread().getName());
      throw new ServiceException(SeckillStateEnum.OVER.getDesc());
    }
  }

  @Override
  public Integer selectCount() {
    return this.seckillDAO.getCount();
  }

  @Override
  public void update(int count) {
    this.seckillDAO.update(count);
  }
}
