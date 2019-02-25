package com.loodeer.pattern.mediator.common;

/**
 * @author loodeer
 * @date 2019-02-25 23:15
 */
public class ConcreteColleague2 extends Colleague{
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }
    public void selfMethod2() {
        // 处理自己的逻辑
    }
    public void depMethod2() {
        // 处理自己的逻辑
        // 自己不能处理的业务逻辑，委托给中介者处理
        super.mediator.doSomething2();
    }
}
