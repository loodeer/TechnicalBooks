package com.loodeer.pattern.interpreter.eg1;

import java.util.HashMap;

/**
 * @author loodeer
 * @date 2019-02-20 23:05
 */
public abstract class Expression {
    public abstract int interpreter(HashMap<String, Integer> var);
}
