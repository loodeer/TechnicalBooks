package com.loodeer.pattern.singleton.eg1;

/**
 * @author loodeer
 * @date 2019-02-27 00:07
 */
public class Minister {
    public static void main(String[] args) {
        // 大臣觐见皇帝，每天都是同一个皇帝
        for (int day = 0; day < 3; day++) {
            Emperor emperor = Emperor.getInstance();
            emperor.say();
        }
    }
}
