package com.loodeer.pattern.interpreter.eg1;

import java.util.HashMap;

/**
 * @author loodeer
 * @date 2019-02-20 23:10
 */
public class AddExpression extends SymbolExpression{
    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }
    @Override public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
