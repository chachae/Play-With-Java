package com.chachae.java.collection.super_this;

/**
 *
 * @author chachae
 * @date 2020/10/22 20:28
 * @version v1.0
 */
public class A extends Thread{
  @Override

  public void run(){

    try {

      Thread.sleep(1000);

    } catch (InterruptedException e){

      e.printStackTrace();

    }

    System. out .print( "run" );

  }

  public static void main(String[] args){

    A example= new A();

    example.run();

    System. out .print( "main" );

  }
}