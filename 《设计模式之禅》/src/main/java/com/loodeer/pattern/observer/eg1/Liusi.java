package com.loodeer.pattern.observer.eg1;

import java.util.Observable;
import java.util.Observer;

/**
 * @author loodeer
 * @date 2019-02-16 21:47
 */
public class Liusi implements Observer {
    public void update(Observable o, Object arg) {
        System.out.println("刘斯: 观察到韩非子活动，开始向老板汇报...");
        this.reportToBoss(arg.toString());
        System.out.println("刘斯：汇报完毕");
    }

    private void reportToBoss(String reportContext) {
        System.out.println("刘斯：报告老板，韩非子有活动了 ===> " + reportContext);
    }
}
