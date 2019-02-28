package com.loodeer.pattern.factory.eg3;

/**
 * @author loodeer
 * @date 2019-02-28 23:50
 */
public class YellowHuman implements Human {
    public void getColor() {
        System.out.println("黄色人种的皮肤颜色是黄色的");
    }

    public void talk() {
        System.out.println("黄人说话");
    }
}
