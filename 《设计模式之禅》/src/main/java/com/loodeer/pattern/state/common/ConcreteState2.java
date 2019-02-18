package com.loodeer.pattern.state.common;

/**
 * @author loodeer
 * @date 2019-02-19 00:08
 */
public class ConcreteState2 extends State{
    @Override public void handle1() {
        super.context.setCurrentState(Context.STATE1);
        super.context.handle1();
    }

    @Override public void handle2() {
        // 本状态下必须要处理的逻辑
    }
}
