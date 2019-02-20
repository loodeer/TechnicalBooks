package com.loodeer.pattern.bridge.common;

/**
 * @author loodeer
 * @date 2019-02-20 22:52
 */
public class ConcreteImplementor2 implements Implementor{
    public void doSomething() {
        System.out.println("ConcreteImplementor2.doSomething");
    }

    public void doAnything() {
        System.out.println("ConcreteImplementor2.doAnything");
    }
}
