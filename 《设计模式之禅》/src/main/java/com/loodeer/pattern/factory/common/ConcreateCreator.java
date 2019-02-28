package com.loodeer.pattern.factory.common;

/**
 * @author loodeer
 * @date 2019-03-01 00:01
 */
public class ConcreateCreator extends Creator{
    @Override public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product)Class.forName(c.getName()).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T)product;
    }
}
