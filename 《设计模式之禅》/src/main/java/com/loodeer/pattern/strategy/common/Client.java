package com.loodeer.pattern.strategy.common;

/**
 * @author loodeer
 * @date 2019-02-16 22:32
 */
public class Client {
    public static void main(String[] args) {
        strategy1();
        strategy2();
    }

    private static Object strategy1() {
        Strategy strategy = new ConcreteStrategy1();
        Context context = new Context(strategy);
        context.doAnything();
        return null;
    }

    private static Object strategy2() {
        Strategy strategy = new ConcreteStrategy2();
        Context context = new Context(strategy);
        context.doAnything();
        return null;
    }
}
