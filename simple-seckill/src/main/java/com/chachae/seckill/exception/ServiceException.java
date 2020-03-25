package com.chachae.seckill.exception;

/**
 * @author chachae
 * @since 2020/3/23 21:22
 */
public class ServiceException extends RuntimeException {

  public ServiceException(String message) {
    super(message);
  }
}
