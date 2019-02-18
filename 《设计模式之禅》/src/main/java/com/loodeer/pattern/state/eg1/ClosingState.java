package com.loodeer.pattern.state.eg1;

/**
 * @author loodeer
 * @date 2019-02-19 00:27
 */
public class ClosingState extends LiftState {
    @Override public void open() {
        super.context.setLiftState(Context.OPENNING_STATE);
        super.context.open();
    }

    @Override public void close() {
        System.out.println("关闭电梯门");
    }

    @Override public void run() {
        super.context.setLiftState(Context.RUNNING_STATE);
        super.context.run();
    }

    @Override public void stop() {
        super.context.setLiftState(Context.STOPPING_STATE);
        super.context.stop();
    }
}
