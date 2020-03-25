package com.chachae.seckill.base;

import com.chachae.seckill.domain.SeckillStateEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author chachae
 * @since 2020/3/23 21:32
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Result<T> {

  private Integer code;

  private T data;

  private String msg;

  public static Result<Object> ok() {

    return new Result<Object>()
        .setCode(SeckillStateEnum.SUCCESS.getState())
        .setMsg(SeckillStateEnum.SUCCESS.getDesc())
        .setData(null);
  }

  public static <T> Result<T> ok(T t) {

    return new Result<T>()
        .setCode(SeckillStateEnum.SUCCESS.getState())
        .setMsg(SeckillStateEnum.SUCCESS.getDesc())
        .setData(t);
  }

  public static <T> Result<T> fail(int state, String desc) {
    return new Result<T>().setCode(state).setMsg(desc).setData(null);
  }
}
