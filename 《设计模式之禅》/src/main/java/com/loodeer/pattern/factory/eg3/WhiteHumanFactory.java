package com.loodeer.pattern.factory.eg3;

/**
 * @author loodeer
 * @date 2019-03-01 00:07
 */
public class WhiteHumanFactory extends AbstractHumanFactory{

    @Override public Human createHuman() {
        return new WhiteHuman();
    }
}
