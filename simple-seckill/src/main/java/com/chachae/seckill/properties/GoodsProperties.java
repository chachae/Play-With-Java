package com.chachae.seckill.properties;

import lombok.Data;

/**
 * @author chachae
 * @since 2020/3/23 20:48
 */
@Data
public class GoodsProperties {

  /** 商品数量 */
  private Integer nums;

  /** 每次放行的线程数 */
  private Integer avg;
}
