package com.loodeer.pattern.interpreter.common;

/**
 * @author loodeer
 * @date 2019-02-20 23:39
 * 抽象表达式
 */
public abstract class Expression {
    public abstract Object interpreter(Context ctx);
}
