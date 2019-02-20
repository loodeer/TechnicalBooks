package com.loodeer.pattern.interpreter.common;

import java.util.Stack;

/**
 * @author loodeer
 * @date 2019-02-20 23:45
 */
public class Client {
    public static void main(String[] args) {
        // 通常定一个语法容器，容纳一个具体的表达式，通常为 ListArry、LinkedList、Stack 等类型
        Stack<Expression> stack = new Stack<Expression>();
        for(;;) {
            // 进行语法判断，并产生递归调用
        }
        Expression exp = stack.pop();

        // 具体元素进入场景
        Context ctx = new Context();
        exp.interpreter(ctx);
    }
}
