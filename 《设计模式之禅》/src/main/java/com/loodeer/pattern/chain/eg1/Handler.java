package com.loodeer.pattern.chain.eg1;

/**
 * @author loodeer
 * @date 2019-02-14 10:07
 */

public abstract class Handler {
    public final static int FATHER_LEVEL_REQUEST = 1;
    public final static int HUSBAND_LEVEL_REQUEST = 2;
    public final static int SON_LEVEL_REQUEST = 3;

    // 能处理的级别
    private int level = 0;
    // 责任传递，下一个责任人是谁
    private Handler nextHandler;

    public Handler(int level) {
        this.level = level;
    }
    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }
    protected abstract void response(IWomen women);

    public final void HandleMessage(IWomen women) {
        if (women.getType() == this.level) {
            this.response(women);
        } else {
            if (this.nextHandler != null) {
                this.nextHandler.HandleMessage(women);
            } else {
                System.out.println("---没人能处理了，按不同意处理---");
            }
        }
    }
}

