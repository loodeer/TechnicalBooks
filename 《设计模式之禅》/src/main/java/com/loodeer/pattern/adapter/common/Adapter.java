package com.loodeer.pattern.adapter.common;

/**
 * @author loodeer
 * @date 2019-02-14 23:29
 * 适配器角色
 */
public class Adapter extends Adaptee implements Target{
    public void request() {
        super.doSomething();
    }
}
