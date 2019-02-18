package com.loodeer.pattern.state.eg1;

/**
 * @author loodeer
 * @date 2019-02-19 00:18
 */
public class OpenningState extends LiftState{

    // 只实现自己状态对应的动作，剩余的动作交给对应的状态去处理
    @Override public void open() {
        System.out.println("打开电梯门 ...");
    }

    @Override public void close() {
        // context 改为 ClosingState
        super.context.setLiftState(Context.CLOSING_STATE);
        // 由 ClosingState 来关门
        super.context.close();
    }

    // 电梯门开着的时候，不能启动
    @Override public void run() {
        // do nothing
    }

    // 电梯门开着的时候，自然是停止状态。就没有停止一说
    @Override public void stop() {
        // do nothing
    }
}
