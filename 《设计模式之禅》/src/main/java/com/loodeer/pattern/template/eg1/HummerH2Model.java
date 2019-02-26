package com.loodeer.pattern.template.eg1;

/**
 * @author loodeer
 * @date 2019-02-26 23:50
 */
public class HummerH2Model extends HummerModel{
    @Override public void start() {
        System.out.println("悍马H2发动");
    }

    @Override public void stop() {
        System.out.println("悍马H2停车");
    }

    @Override public void alarm() {
        System.out.println("悍马H2不鸣笛，开车很文明");
    }

    @Override public void engineBoom() {
        System.out.println("悍马H2引擎声音是这样的");
    }
}
