package com.loodeer.pattern.singleton.eg1;

/**
 * @author loodeer
 * @date 2019-02-27 00:06
 */
public class Emperor {
    private static final Emperor emperor = new Emperor();
    private Emperor() {
    }
    public static Emperor getInstance() {
        return emperor;
    }
    public static void say() {
        System.out.println("我就是皇帝xxx");
    }
}
