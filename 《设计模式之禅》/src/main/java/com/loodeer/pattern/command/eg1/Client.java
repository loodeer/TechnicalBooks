package com.loodeer.pattern.command.eg1;

/**
 * @author loodeer
 * @date 2019-02-21 23:29
 */
public class Client {
    public static void main(String[] args) {
        // 定义接口人
        Invoker xiaosan = new Invoker();
        System.out.println("---客户要求增加一项需求---");
        Command command = new AddRequirementCommand();
        xiaosan.setCommand(command);
        xiaosan.action();
    }
}
