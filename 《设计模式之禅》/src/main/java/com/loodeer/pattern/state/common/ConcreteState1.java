package com.loodeer.pattern.state.common;

/**
 * @author loodeer
 * @date 2019-02-19 00:06
 */
public class ConcreteState1 extends State{
    @Override public void handle1() {
        // 本状态下必须处理的逻辑
    }

    @Override public void handle2() {
        // 设置当前状态为 state2
        super.context.setCurrentState(Context.STATE2);
        // 过渡到 state2 状态
        super.context.handle2();
    }
}
