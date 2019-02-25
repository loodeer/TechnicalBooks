package com.loodeer.pattern.mediator.eg1;

import java.util.Random;

/**
 * @author loodeer
 * @date 2019-02-25 23:26
 */
public class Sale extends AbstractColleague {
    public Sale(AbstractMediator mediator) {
        super(mediator);
    }
    public void sellIBMComputer(int number) {
        super.mediator.execute("sale.sell", number);
    }
    public int getSaleStatus() {
        Random random = new Random(System.currentTimeMillis());
        int saleStatus = random.nextInt(100);
        System.out.println("IBM电脑的销售情况为:" + saleStatus);
        return saleStatus;
    }
    public void offSale() {
        super.mediator.execute("sale.offsell");
    }
}
