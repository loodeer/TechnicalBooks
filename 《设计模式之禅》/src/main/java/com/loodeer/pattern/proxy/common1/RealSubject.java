package com.loodeer.pattern.proxy.common1;

/**
 * @author loodeer
 * @date 2019-02-26 23:24
 */
public class RealSubject implements Subject{
    public void doSOmething(String string) {
        System.out.println("do something --->" + string);
    }
}
