package com.loodeer.pattern.factory.common;

/**
 * @author loodeer
 * @date 2019-03-01 00:00
 */
public abstract class Creator {
    public abstract <T extends Product> T createProduct(Class<T> c);
}
