package com.loodeer.pattern.factory.eg3;

/**
 * @author loodeer
 * @date 2019-03-01 00:07
 */
public class YellowHumanFactory extends AbstractHumanFactory{

    @Override public Human createHuman() {
        return new YellowHuman();
    }
}
