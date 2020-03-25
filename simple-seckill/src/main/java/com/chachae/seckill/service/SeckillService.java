package com.chachae.seckill.service;

/**
 * @author chachae
 * @since 2020/3/23 20:10
 */
public interface SeckillService {

  /**
   * 秒杀
   *
   * @return int
   */
  Integer kill();

  /**
   * 获取数量
   *
   * @return integer
   */
  Integer selectCount();

  /**
   * 更新库存
   *
   * @param count 库存量
   */
  void update(int count);
}
