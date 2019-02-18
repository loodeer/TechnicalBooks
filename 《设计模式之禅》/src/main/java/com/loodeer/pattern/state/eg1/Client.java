package com.loodeer.pattern.state.eg1;

/**
 * @author loodeer
 * @date 2019-02-19 00:40
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(Context.CLOSING_STATE);
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
