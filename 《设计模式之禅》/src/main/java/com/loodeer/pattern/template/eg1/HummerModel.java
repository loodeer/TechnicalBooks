package com.loodeer.pattern.template.eg1;

/**
 * @author loodeer
 * @date 2019-02-26 23:48
 */
public abstract class HummerModel {
    public abstract void start();
    public abstract void stop();
    public abstract void alarm();
    public abstract void engineBoom();
    public void run() {
        this.start();
        this.engineBoom();
        this.alarm();
        this.stop();
    }
}
