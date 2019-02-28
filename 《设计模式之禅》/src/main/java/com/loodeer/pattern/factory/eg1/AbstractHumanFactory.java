package com.loodeer.pattern.factory.eg1;

/**
 * @author loodeer
 * @date 2019-02-28 23:52
 */
public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> c);
}
