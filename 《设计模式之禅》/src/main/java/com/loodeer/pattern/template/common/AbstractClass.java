package com.loodeer.pattern.template.common;

/**
 * @author loodeer
 * @date 2019-02-26 23:43
 */
public abstract class AbstractClass {
    protected abstract void doSomething();
    protected abstract void doAnything();
    public void templateMethod() {
        this.doAnything();
        this.doSomething();;
    }
}
