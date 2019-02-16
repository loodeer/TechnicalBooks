package com.loodeer.pattern.observer.common;

/**
 * @author loodeer
 * @date 2019-02-16 21:32
 */
public class Client {
    public static void main(String[] args) {
        // 创建一个被观察者
        ConcreteSubject subject = new ConcreteSubject();
        // 定义两个观察者
        Observer observer1 = new ConcreteObserver();
        Observer observer2 = new ConcreteObserver();
        // 被观察者添加观察者
        subject.addObserver(observer1);
        subject.addObserver(observer2);
        // 被观察者开始活动
        subject.doSomething();
    }
}
