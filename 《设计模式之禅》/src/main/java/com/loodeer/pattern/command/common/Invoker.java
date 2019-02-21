package com.loodeer.pattern.command.common;

/**
 * @author loodeer
 * @date 2019-02-21 23:28
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action() {
        this.command.execute();
    }
}
