package com.loodeer.pattern.strategy.eg1;

/**
 * @author loodeer
 * @date 2019-02-13 23:34
 */
public class GivenGreenLight implements IStrategy {
    public void operate() {
        System.out.println("求吴国太开绿灯，放行");
    }
}
