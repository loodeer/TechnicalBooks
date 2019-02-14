package com.loodeer.pattern.adapter.common;

/**
 * @author loodeer
 * @date 2019-02-14 23:30
 */
public class Client {
    public static void main(String[] args) {
        // 原有业务逻辑
        Target target = new ConcreteTarget();
        target.request();

        // 现在增加了适配器角色后的业务逻辑
        Target target1 = new Adapter();
        target1.request();
    }
}
