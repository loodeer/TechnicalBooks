package com.loodeer.pattern.mediator.eg1;

/**
 * @author loodeer
 * @date 2019-02-25 23:24
 */
public abstract class AbstractMediator {
    protected Purchase purchase;
    protected Sale sale;
    protected Stock stock;

    public AbstractMediator() {
        // 注意这里
        this.purchase = new Purchase(this);
        this.sale = new Sale(this);
        this.stock = new Stock(this);
    }

    public abstract void execute(String str, Object... objects);
}
