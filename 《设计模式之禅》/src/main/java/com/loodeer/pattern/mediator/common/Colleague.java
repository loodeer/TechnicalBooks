package com.loodeer.pattern.mediator.common;

/**
 * @author loodeer
 * @date 2019-02-25 23:14
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
