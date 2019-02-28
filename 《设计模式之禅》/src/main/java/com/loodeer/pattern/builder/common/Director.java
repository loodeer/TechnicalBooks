package com.loodeer.pattern.builder.common;

/**
 * @author loodeer
 * @date 2019-02-28 23:42
 */
public class Director {
    private Builder builder = new ConcreteProduct();
    public Product getProduct() {
        builder.setPart();
        return builder.buildProduct();
    }
}
