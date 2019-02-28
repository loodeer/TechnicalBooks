package com.loodeer.pattern.factory.eg1;

/**
 * @author loodeer
 * @date 2019-02-28 23:57
 */
public class NvWa {
    public static void main(String[] args) {
        HumanFactory humanFactory = new HumanFactory();

        BlackHuman blackHuman = humanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();

        WhiteHuman whiteHuman = humanFactory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();

    }
}
