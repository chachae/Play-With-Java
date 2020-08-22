package com.chachae.design.behaviour.interpreter;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/28 21:54
 */
public class NonterminaExpression implements Expression {

  public Expression left;

  private Expression right;

  public NonterminaExpression(Expression left,
      Expression right) {
    this.left = left;
    this.right = right;
  }

  public void interpreter(Context context) {
    // 递归调用每个组成部分的interpreter()
  }
}
