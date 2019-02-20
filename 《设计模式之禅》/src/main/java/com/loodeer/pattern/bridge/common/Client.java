package com.loodeer.pattern.bridge.common;

/**
 * @author loodeer
 * @date 2019-02-20 22:58
 */
public class Client {
    public static void main(String[] args) {
        Implementor impl = new ConcreteImplementor1();
        Abstraction abs = new RefinedAbstraction(impl);
        abs.request();
    }
}
