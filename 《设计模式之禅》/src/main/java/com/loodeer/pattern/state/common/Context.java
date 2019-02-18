package com.loodeer.pattern.state.common;

/**
 * @author loodeer
 * @date 2019-02-19 00:05
 */
public class Context {
    public final static State STATE1 = new ConcreteState1();
    public final static State STATE2 = new ConcreteState2();
    private State CurrentState;

    public State getCurrentState() {
        return CurrentState;
    }

    public void setCurrentState(State currentState) {
        CurrentState = currentState;
        // 切换状态
        this.CurrentState.setContext(this);
    }
    // 行为委托
    public void handle1() {
        this.CurrentState.handle1();
    }
    public void handle2() {
        this.CurrentState.handle2();
    }
}
