package com.loodeer.pattern.bridge.eg1;

/**
 * @author loodeer
 * @date 2019-02-20 22:42
 */
public class House extends Product{
    @Override public void beProducted() {
        System.out.println("房子生产成功 ...");
    }

    @Override public void beSelled() {
        System.out.println("房子出售成功 ...");
    }
}
