package com.loodeer.pattern.proxy.common1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author loodeer
 * @date 2019-02-26 23:28
 * 可以再定义一个 SubjectDynamicProxy 的实现类使其具有业务意义
 */
public class DynamicProxy<T> {
    /*
     * AOP 框架的几个核心名称概念
     * Aspect 切面
     * JointPoint 切入点
     * Advice 通知
     * Weave 织入
     */
    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h) {
        // 寻找 JoinPoint 链接点，AOP 框架使用元数据定义
        if (true) {
            // 执行一个前置通知
            (new BeforeAdvice()).exec();
        }
        // 找到目标类的所有接口，并实现接口的方法。当然方法是空的，具体由 h 接管
        return (T) Proxy.newProxyInstance(loader, interfaces, h);
    }
}
