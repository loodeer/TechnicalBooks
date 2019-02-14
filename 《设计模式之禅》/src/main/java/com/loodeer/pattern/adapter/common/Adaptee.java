package com.loodeer.pattern.adapter.common;

/**
 * @author loodeer
 * @date 2019-02-14 23:28
 * 源角色，生成环境服役状态
 */
public class Adaptee {
    // 原有的业务逻辑
    public void doSomething() {
        System.out.println("I'm kind of busy, leave me alone, pls!");
    }
}
