package com.loodeer.pattern.interpreter.common;

/**
 * @author loodeer
 * @date 2019-02-20 23:40
 * 终结符表达式，对应 eg1.VarExpression
 */
public class TerminalExpression extends Expression {
    @Override public Object interpreter(Context ctx) {
        return null;
    }
}
