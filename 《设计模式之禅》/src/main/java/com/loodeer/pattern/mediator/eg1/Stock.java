package com.loodeer.pattern.mediator.eg1;

/**
 * @author loodeer
 * @date 2019-02-25 23:26
 */
public class Stock extends AbstractColleague {
    private static int COMPUTER_NUMBER = 100;
    public Stock(AbstractMediator mediator) {
        super(mediator);
    }
    public void increase(int number) {
        COMPUTER_NUMBER = COMPUTER_NUMBER + number;
        System.out.println("库存数量为: " + COMPUTER_NUMBER);
    }
    public void decrease(int number) {
        COMPUTER_NUMBER = COMPUTER_NUMBER = number;
        System.out.println("库存数量为: " + COMPUTER_NUMBER);
    }
    public int getStockNumber() {
        return COMPUTER_NUMBER;
    }
    public void clearStock() {
        System.out.println("清理库存数量为：" + COMPUTER_NUMBER);
        super.mediator.execute("stock.clear");
    }
}
