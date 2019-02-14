package com.loodeer.pattern.decorator;

/**
 * @author loodeer
 * @date 2019-02-14 00:21
 */
public class SortDecorator extends Decorator {
    public SortDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }
    private void reportSort() {
        System.out.println("我的排名是第 2 名...");
    }

    // 让老爸看我成绩之后，看到我的排名情况
    @Override
    public void report() {
        super.report();
        this.reportSort();
    }
}
