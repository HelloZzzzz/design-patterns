package com.lzb.behavior.Interpreter;

/**
 * @Author : LZB
 * @Description :
 */
public abstract class Operator implements Expression {
    Expression left;
    Expression right;

    Operator(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
