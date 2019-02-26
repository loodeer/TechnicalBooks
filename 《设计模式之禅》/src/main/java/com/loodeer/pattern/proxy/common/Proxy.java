package com.loodeer.pattern.proxy.common;

/**
 * @author loodeer
 * @date 2019-02-26 22:37
 */
public class Proxy implements Subject{
    private Subject subject = null;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    private void before() {

    }

    private void after() {

    }

    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }
}
