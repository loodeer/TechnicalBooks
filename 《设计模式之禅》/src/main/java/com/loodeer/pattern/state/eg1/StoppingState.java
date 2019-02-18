package com.loodeer.pattern.state.eg1;

/**
 * @author loodeer
 * @date 2019-02-19 00:28
 */
public class StoppingState extends LiftState{
    @Override public void open() {
        super.context.setLiftState(Context.OPENNING_STATE);
        super.context.open();
    }

    @Override public void close() {
        super.context.setLiftState(Context.CLOSING_STATE);
        super.context.close();
    }

    @Override public void run() {
        super.context.setLiftState(Context.RUNNING_STATE);
        super.context.run();
    }

    @Override public void stop() {
        System.out.println("电梯停止运行...");
    }
}
