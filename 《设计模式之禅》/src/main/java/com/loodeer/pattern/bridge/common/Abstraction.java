package com.loodeer.pattern.bridge.common;

/**
 * @author loodeer
 * @date 2019-02-20 22:54
 */
public abstract class Abstraction {
    private Implementor impl;
    // 约束子类必须实现该构造函数
    public Abstraction(Implementor impl) {
        this.impl = impl;
    }
    // 自身的行为和属性
    public void request() {
        this.impl.doSomething();
    }
    // 获得实现化角色
    public Implementor getImpl() {
        return impl;
    }
}
