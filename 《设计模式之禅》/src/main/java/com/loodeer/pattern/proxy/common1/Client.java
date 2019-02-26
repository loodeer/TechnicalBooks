package com.loodeer.pattern.proxy.common1;

import java.lang.reflect.InvocationHandler;

/**
 * @author loodeer
 * @date 2019-02-26 23:32
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        InvocationHandler handler = new MyInvocationHandler(subject);
        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), handler);
        proxy.doSOmething("Finish");
    }
}
