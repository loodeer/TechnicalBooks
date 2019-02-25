package com.loodeer.pattern.mediator.eg1;

/**
 * @author loodeer
 * @date 2019-02-25 23:24
 */
public class Purchase extends AbstractColleague{
    public Purchase(AbstractMediator mediator) {
        super(mediator);
    }
    public void buyIBMcomputer(int number) {
        super.mediator.execute("puchase.buy", number);
    }
    public void refuseBuyIBM() {
        System.out.println("不再采购IBM电脑");
    }
}
