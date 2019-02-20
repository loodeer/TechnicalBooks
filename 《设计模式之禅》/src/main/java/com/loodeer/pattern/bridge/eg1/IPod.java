package com.loodeer.pattern.bridge.eg1;

/**
 * @author loodeer
 * @date 2019-02-20 22:43
 */
public class IPod extends Product{
    @Override public void beProducted() {
        System.out.println("IPod 生产成功 ...");
    }

    @Override public void beSelled() {
        System.out.println("IPod 出售成功 ...");
    }
}
