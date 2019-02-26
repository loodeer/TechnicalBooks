package com.loodeer.pattern.proxy.eg5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author loodeer
 * @date 2019-02-26 23:09
 * 动态代理
 */
public class GamePlayIH implements InvocationHandler {
    // 被代理者
    Class cls = null;
    // 被代理者的实例
    Object obj = null;
    // 我要代理谁
    public GamePlayIH(Object obj) {
        this.obj = obj;
    }
    // 调用被代理的方法
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.obj, args);
        // 动态代理后的威力
        if (method.getName().equalsIgnoreCase("login")) {
            System.out.println("有人在用我的账号登陆!");
        }
        return result;
    }
}
