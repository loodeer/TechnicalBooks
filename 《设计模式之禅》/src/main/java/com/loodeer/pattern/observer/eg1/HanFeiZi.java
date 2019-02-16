package com.loodeer.pattern.observer.eg1;

import java.util.Observable;

/**
 * @author loodeer
 * @date 2019-02-16 21:39
 */
public class HanFeiZi extends Observable implements IHanFeiZi {

    public void haveBreakfast() {
        System.out.println("韩非子开始吃饭了 ...");
        super.setChanged();
        super.notifyObservers("韩非子在吃饭");
    }

    public void haveFun() {
        System.out.println("韩非子开始娱乐了 ...");
        super.setChanged();
        super.notifyObservers("韩非子在娱乐");
    }
}
