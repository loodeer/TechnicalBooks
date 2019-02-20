package com.loodeer.pattern.bridge.eg1;

/**
 * @author loodeer
 * @date 2019-02-20 22:44
 */
public abstract class Corp {
    private Product product;
    public Corp(Product product) {
        this.product = product;
    }
    public void makeMoney() {
        this.product.beProducted();
        this.product.beSelled();
    }
}
