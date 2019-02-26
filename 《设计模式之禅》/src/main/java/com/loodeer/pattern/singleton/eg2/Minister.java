package com.loodeer.pattern.singleton.eg2;

/**
 * @author loodeer
 * @date 2019-02-27 00:07
 */
public class Minister {
    public static void main(String[] args) {
        // 大臣觐见皇帝，会见到不同的皇帝
        for (int day = 0; day < 10; day++) {
            Emperor emperor = Emperor.getInstance();
            emperor.say();
        }
    }
}
