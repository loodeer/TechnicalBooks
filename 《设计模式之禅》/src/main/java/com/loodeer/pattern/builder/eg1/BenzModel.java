package com.loodeer.pattern.builder.eg1;

/**
 * @author loodeer
 * @date 2019-02-28 23:19
 */
public class BenzModel extends CarModel{
    @Override protected void start() {
        System.out.println("奔驰车开起来是这样子的...");
    }

    @Override protected void stop() {
        System.out.println("奔驰车停下来是这样子的...");
    }

    @Override protected void alarm() {
        System.out.println("奔驰车喇叭响起来是这样子的...");
    }

    @Override protected void engineBoom() {
        System.out.println("奔驰车引擎声是这样子的...");
    }
}
