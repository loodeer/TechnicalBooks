package com.loodeer.pattern.factory.eg2;

/**
 * @author loodeer
 * @date 2019-02-28 23:57
 * 简单工程模式
 */
public class NvWa {
    public static void main(String[] args) {

        BlackHuman blackHuman = HumanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();

        WhiteHuman whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();

    }
}
