package com.loodeer.pattern.adapter.common;

/**
 * @author loodeer
 * @date 2019-02-14 23:27
 * 目标角色的实现类
 */
public class ConcreteTarget implements Target{
    public void request() {
        System.out.println("if you need any help,pls call me");
    }
}
