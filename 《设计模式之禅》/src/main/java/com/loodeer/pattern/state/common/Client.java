package com.loodeer.pattern.state.common;

/**
 * @author loodeer
 * @date 2019-02-19 00:11
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setCurrentState(new ConcreteState1());

        // 行为执行
        context.handle1();
        context.handle2();
    }
}
