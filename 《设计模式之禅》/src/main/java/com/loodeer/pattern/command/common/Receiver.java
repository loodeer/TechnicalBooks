package com.loodeer.pattern.command.common;

/**
 * @author loodeer
 * @date 2019-02-21 23:32
 */
public abstract class Receiver {
    // 抽象接收者，定义每个接收者都必须完成的任务
    public abstract void doSomething();
}
