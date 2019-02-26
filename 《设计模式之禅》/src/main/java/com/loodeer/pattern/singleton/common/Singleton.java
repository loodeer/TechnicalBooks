package com.loodeer.pattern.singleton.common;

/**
 * @author loodeer
 * @date 2019-02-27 00:03
 *
 */
public class Singleton {
    // 饿汉式单例，线程安全
    private static final Singleton singleton = new Singleton();
    private Singleton() {
    }
    public static Singleton getSingleton() {
        return singleton;
    }
    // 类中其他方法，尽量是 static
    public static void doSomething() {

    }
}
