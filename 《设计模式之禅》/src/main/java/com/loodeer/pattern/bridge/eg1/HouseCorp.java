package com.loodeer.pattern.bridge.eg1;

/**
 * @author loodeer
 * @date 2019-02-20 22:45
 */
public class HouseCorp extends Corp{
    public HouseCorp(House house) {
        super(house);
    }
    @Override public void makeMoney() {
        super.makeMoney();
        System.out.println("房地产公司赚大钱了 ...");
    }
}
