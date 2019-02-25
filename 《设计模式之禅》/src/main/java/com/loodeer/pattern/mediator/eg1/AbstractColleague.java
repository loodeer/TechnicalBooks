package com.loodeer.pattern.mediator.eg1;

/**
 * @author loodeer
 * @date 2019-02-25 23:23
 */
public abstract class AbstractColleague {
    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}
