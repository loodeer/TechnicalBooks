package com.loodeer.pattern.interpreter.eg1;

import java.util.HashMap;

/**
 * @author loodeer
 * @date 2019-02-20 23:07
 */
public class VarExpression extends Expression {
    private String key;
    public VarExpression(String key) {
        this.key = key;
    }
    @Override public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
