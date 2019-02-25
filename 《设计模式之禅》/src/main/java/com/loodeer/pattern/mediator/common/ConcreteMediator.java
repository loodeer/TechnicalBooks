package com.loodeer.pattern.mediator.common;

/**
 * @author loodeer
 * @date 2019-02-25 23:18
 */
public class ConcreteMediator extends Mediator {
    @Override public void doSomething1() {
        // 调用同时类的方法
        super.c1.selfMethod1();
        super.c2.selfMethod2();
    }

    @Override public void doSomething2() {
        super.c1.selfMethod1();
        super.c2.selfMethod2();
    }
}
