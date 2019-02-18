package com.loodeer.pattern.state.eg1;

/**
 * @author loodeer
 * @date 2019-02-19 00:17
 */
public abstract class LiftState {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void open();
    public abstract void close();
    public abstract void run();
    public abstract void stop();
}
