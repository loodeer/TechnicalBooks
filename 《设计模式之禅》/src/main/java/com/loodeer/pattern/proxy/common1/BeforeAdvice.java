package com.loodeer.pattern.proxy.common1;

/**
 * @author loodeer
 * @date 2019-02-26 23:31
 */
public class BeforeAdvice implements IAdvice{
    public void exec() {
        System.out.println("我是前置通知，我被执行了!");
    }
}
