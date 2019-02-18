package com.loodeer.pattern.state.eg1;

/**
 * @author loodeer
 * @date 2019-02-19 00:27
 */
public class RunningState extends LiftState {
    @Override public void open() {
        // do nothing
    }

    @Override public void close() {
        // do nothing
    }

    @Override public void run() {
        System.out.println("电梯上下运行");
    }

    @Override public void stop() {
        super.context.setLiftState(Context.STOPPING_STATE);
        super.context.stop();
    }
}
