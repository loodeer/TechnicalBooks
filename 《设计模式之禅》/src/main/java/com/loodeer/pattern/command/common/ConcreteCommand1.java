package com.loodeer.pattern.command.common;

/**
 * @author loodeer
 * @date 2019-02-21 23:35
 */
public class ConcreteCommand1 extends Command{
    private Receiver receiver;

    public ConcreteCommand1(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override public void execute() {
        this.receiver.doSomething();
    }
}
