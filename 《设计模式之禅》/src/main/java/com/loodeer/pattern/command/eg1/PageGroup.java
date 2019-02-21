package com.loodeer.pattern.command.eg1;

/**
 * @author loodeer
 * @date 2019-02-21 23:21
 * 美工组
 */
public class PageGroup extends Group {
    @Override public void find() {
        System.out.println("找到美工组...");
    }

    @Override public void add() {
        System.out.println("客户要求增加一项页面...");
    }

    @Override public void change() {
        System.out.println("客户要求修改一项页面...");
    }

    @Override public void delete() {
        System.out.println("客户要求删除一项页面...");
    }

    @Override public void plan() {
        System.out.println("客户要求变更页面计划...");
    }
}
