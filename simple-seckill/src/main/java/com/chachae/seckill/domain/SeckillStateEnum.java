package com.chachae.seckill.domain;

/**
 * @author chachae
 * @since 2020/3/23 20:10
 */
public enum SeckillStateEnum {

  /** 秒杀成功 */
  SUCCESS(1, "秒杀成功"),

  /** 服务器异常 */
  FAIL(-1, "服务器异常"),

  /** 秒杀失败 */
  OVER(0, "秒杀失败");

  private int value;

  private String desc;

  SeckillStateEnum(int value, String desc) {
    this.value = value;
    this.desc = desc;
  }

  public int getState() {
    return value;
  }

  public String getDesc() {
    return desc;
  }

  public static int getState(String message) {
    for (SeckillStateEnum state : values()) {
      if (state.getDesc().equals(message)) {
        return state.getState();
      }
    }
    return -1;
  }
}
