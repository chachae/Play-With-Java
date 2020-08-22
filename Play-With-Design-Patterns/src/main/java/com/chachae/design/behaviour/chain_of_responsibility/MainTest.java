package com.chachae.design.behaviour.chain_of_responsibility;

/**
 * 责任链（chain of responsibility）
 *
 * @author chachae
 * @version v1.0
 * @date 2020/7/23 15:53
 */
public class MainTest {

  public static void main(String[] args) {
    AuthHandler authHandler = new AuthHandler();
    QueryHandler queryHandler = new QueryHandler();
    ResponseHandler responseHandler = new ResponseHandler();
    authHandler.setHandler(queryHandler);
    queryHandler.setHandler(responseHandler);
    authHandler.operator();
  }
}
