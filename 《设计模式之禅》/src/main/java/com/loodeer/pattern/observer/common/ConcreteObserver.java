package com.loodeer.pattern.observer.common;

/**
 * @author loodeer
 * @date 2019-02-16 21:36
 */
public class ConcreteObserver implements Observer {
    public void update() {
        System.out.println("接收到信息，并进行处理");
    }
}
