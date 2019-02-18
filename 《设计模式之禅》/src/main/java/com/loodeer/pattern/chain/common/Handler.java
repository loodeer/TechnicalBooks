package com.loodeer.pattern.chain.common;

/**
 * @author loodeer
 * @date 2019-02-18 23:41
 */
public abstract class Handler {
    private Handler nextHandler;

    public final Response handleMessage(Request request) {
        Response response = null;
        if (this.getHandleLevel().equals(request.getRequestLevel())) {
            response = this.echo(request);
        } else {
            if (this.nextHandler != null) {
                response = this.nextHandler.handleMessage(request);
            } else {
                // 没有适合的处理者，业务自行处理
            }
        }
        return response;
    }
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }
    // 每个处理者都有一个处理级别
    protected abstract Level getHandleLevel();
    // 每个处理者都必须实现处理任务
    protected abstract Response echo(Request request);
}
