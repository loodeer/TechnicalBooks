package com.loodeer.pattern.state.common;

/**
 * @author loodeer
 * @date 2019-02-19 00:04
 */
public abstract class State {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }
    public abstract void handle1();
    public abstract void handle2();
}
