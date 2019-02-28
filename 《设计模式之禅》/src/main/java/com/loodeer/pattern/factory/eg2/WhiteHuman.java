package com.loodeer.pattern.factory.eg2;

/**
 * @author loodeer
 * @date 2019-02-28 23:50
 */
public class WhiteHuman implements Human {
    public void getColor() {
        System.out.println("白色人种的皮肤颜色是白色的");
    }

    public void talk() {
        System.out.println("白人说话");
    }
}
