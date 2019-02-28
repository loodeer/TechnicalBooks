package com.loodeer.pattern.builder.common;

/**
 * @author loodeer
 * @date 2019-02-28 23:41
 * 建造者模式关注的是零件类型和装配工艺(顺序)
 */
public class ConcreteProduct extends Builder{
    private Product product = new Product();

    @Override public void setPart() {

    }

    @Override public Product buildProduct() {
        return product;
    }
}
