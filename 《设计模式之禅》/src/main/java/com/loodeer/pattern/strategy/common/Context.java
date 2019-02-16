package com.loodeer.pattern.strategy.common;

/**
 * @author loodeer
 * @date 2019-02-16 22:31
 * 封装角色
 */
public class Context {
    private Strategy strategy = null;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doAnything() {
        this.strategy.doSomething();
    }
}
