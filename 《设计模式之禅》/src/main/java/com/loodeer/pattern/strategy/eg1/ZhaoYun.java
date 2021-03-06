package com.loodeer.pattern.strategy.eg1;

/**
 * @author loodeer
 * @date 2019-02-13 23:38
 */
public class ZhaoYun {
    public static void main(String[] args) {
        Context context;
        System.out.println("---刚刚到吴国的时候拆第一个锦囊---");
        context = new Context(new BackDoor());
        context.operate();

        System.out.println("---刘备乐不思蜀了，拆第二个锦囊---");
        context = new Context(new GivenGreenLight());
        context.operate();

        System.out.println("---孙权的小兵追来了，拆第三个锦囊---");
        context = new Context(new BlockEnemy());
        context.operate();
    }
}
