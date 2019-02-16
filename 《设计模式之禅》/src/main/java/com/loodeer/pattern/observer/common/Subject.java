package com.loodeer.pattern.observer.common;

import java.util.Vector;

/**
 * @author loodeer
 * @date 2019-02-16 21:14
 * 被观察者
 */
public abstract class Subject {
    // 观察者数组
    private Vector<Observer> observerVector = new Vector<Observer>();

    public void addObserver(Observer observer) {
        this.observerVector.add(observer);
    }

    public void delObserver(Observer observer) {
        this.observerVector.remove(observer);
    }

    public void nofityObservers() {
        for (Observer observer : this.observerVector) {
            observer.update();
        }
    }
}
