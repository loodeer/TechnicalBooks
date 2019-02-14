package com.loodeer.pattern.decorator;

/**
 * @author loodeer
 * @date 2019-02-14 00:12
 */
public abstract class Decorator extends SchoolReport {
    // 被装饰对象，这里是成绩单
    private SchoolReport schoolReport;
    // 构造函数，将成绩单传进来
    public Decorator(SchoolReport schoolReport) {
        this.schoolReport = schoolReport;
    }
    // 装饰类最终还是把动作的执行委托给被装饰的对象
    @Override
    public void report() {
        this.schoolReport.report();
    }
    @Override
    public void sign(String name) {
        this.schoolReport.sign(name);
    }
}
