package com.loodeer.pattern.factory.common;

/**
 * @author loodeer
 * @date 2019-03-01 00:03
 */
public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreateCreator();
        Product product = creator.createProduct(ConcreteProduct1.class);
    }
}
