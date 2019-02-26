package com.loodeer.pattern.proxy.common1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author loodeer
 * @date 2019-02-26 23:25
 * 动态代理类
 */
public class MyInvocationHandler implements InvocationHandler {
    // 被代理的对象
    private Object target = null;
    // 通过构造函数传递一个对象
    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    // 代理方法
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.target, args);
    }
}
