package com.loodeer.pattern.factory.eg3;

/**
 * @author loodeer
 * @date 2019-02-28 23:57
 * 多工厂模式
 */
public class NvWa {
    public static void main(String[] args) {

        Human blackHuman = (new BlackHumanFactory()).createHuman();
        blackHuman.getColor();
        blackHuman.talk();

        Human whiteHuman = (new WhiteHumanFactory()).createHuman();
        whiteHuman.getColor();
        whiteHuman.talk();

    }
}
