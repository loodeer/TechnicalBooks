package com.loodeer.pattern.decorator;

/**
 * @author loodeer
 * @date 2019-02-14 00:17
 */
public class HighScoreDecorator extends Decorator {
    public HighScoreDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }
    // 汇报最高分
    private void reportHighScore() {
        System.out.println("这次考试语文最高是 61，数学是 62，英语是 63");
    }

    // 让老爸看我成绩之前，让他先看一下最高分
    @Override
    public void report() {
        this.reportHighScore();
        super.report();
    }
}
