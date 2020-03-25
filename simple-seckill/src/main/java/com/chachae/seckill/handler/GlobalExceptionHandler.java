package com.chachae.seckill.handler;

import com.chachae.seckill.base.Result;
import com.chachae.seckill.domain.SeckillStateEnum;
import com.chachae.seckill.exception.ServiceException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author chachae
 * @since 2020/3/23 21:30
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(ServiceException.class)
  public Result<Object> handlerServiceException(ServiceException e) {
    int state = SeckillStateEnum.getState(e.getMessage());
    return Result.fail(state, e.getMessage());
  }
}
