package com.loodeer.pattern.strategy.eg1;

/**
 * @author loodeer
 * @date 2019-02-13 23:35
 */
public class Context {
    private IStrategy strategy;
    // 通过构造函数将策略传递进来
    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }
    // 执行策略方法
    public void operate() {
        strategy.operate();
    }
}
