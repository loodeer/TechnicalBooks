package com.loodeer.pattern.observer.eg1;

import java.util.Observable;
import java.util.Observer;

/**
 * @author loodeer
 * @date 2019-02-16 21:45
 */
public class Lisi implements Observer {
    public void update(Observable o, Object arg) {
        System.out.println("李斯: 观察到韩非子活动，开始向老板汇报...");
        this.reportToBoss(arg.toString());
        System.out.println("李斯：汇报完毕");
    }

    private void reportToBoss(String reportContext) {
        System.out.println("李斯：报告秦始皇，韩非子有活动了 ---> " + reportContext);
    }
}
