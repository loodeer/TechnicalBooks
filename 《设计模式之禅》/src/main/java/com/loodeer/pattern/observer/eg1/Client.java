package com.loodeer.pattern.observer.eg1;

import java.util.Observer;

/**
 * @author loodeer
 * @date 2019-02-16 21:49
 */
public class Client {
    public static void main(String[] args) {
        Observer lisi = new Lisi();
        Observer liusi = new Liusi();

        HanFeiZi hanFeiZi = new HanFeiZi();

        hanFeiZi.addObserver(lisi);
        hanFeiZi.addObserver(liusi);

        hanFeiZi.haveBreakfast();
        hanFeiZi.haveFun();
    }
}
