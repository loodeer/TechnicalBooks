package com.loodeer.pattern.interpreter.eg1;

import java.util.HashMap;

/**
 * @author loodeer
 * @date 2019-02-20 23:08
 */
public abstract class SymbolExpression extends Expression{
    protected Expression left;
    protected Expression right;
    // 所有的解析公式都应关心自己左右两个表达式的结果
    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
