package com.loodeer.pattern.interpreter.common;

/**
 * @author loodeer
 * @date 2019-02-20 23:39
 * 抽象表达式
 * 开源解析工具包 Expression4J、MESP(Math Expression String Parser)、Jep
 */
public abstract class Expression {
    public abstract Object interpreter(Context ctx);
}
