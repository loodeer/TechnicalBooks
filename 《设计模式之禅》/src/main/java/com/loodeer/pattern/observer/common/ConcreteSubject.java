package com.loodeer.pattern.observer.common;

/**
 * @author loodeer
 * @date 2019-02-16 21:30
 * 具体被观察者
 */
public class ConcreteSubject extends Subject{
    public void doSomething() {
        // do something
        super.nofityObservers();
    }
}
