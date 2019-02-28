package com.loodeer.pattern.builder.eg1;

import java.util.ArrayList;

/**
 * @author loodeer
 * @date 2019-02-28 23:25
 */
public class Client {
    public static void main(String[] args) {
        //car1();
        //car2();

        Director director = new Director();
        for (int i = 0; i < 3; i++) {
            System.out.println("---第" + i + "辆奔驰车---");
            director.getABenzModel().run();
            System.out.println("---第" + i + "辆宝马车---");
            director.getBBmwModel().run();
        }
    }

    private static void car1() {
        System.out.println("--- 车型一 ---");
        ArrayList<String> sequence = new ArrayList<String>();
        sequence.add("engine boom");
        sequence.add("start");
        sequence.add("stop");

        BenzBuilder benzBuilder = new BenzBuilder();
        benzBuilder.setSequence(sequence);
        BenzModel benz = (BenzModel)benzBuilder.getCarModel();
        benz.run();

        BmwBuilder bmwBuilder = new BmwBuilder();
        bmwBuilder.setSequence(sequence);
        BmwModel bmw = (BmwModel)bmwBuilder.getCarModel();
        bmw.run();
    }

    private static void car2() {
        System.out.println("--- 车型二 ---");
        ArrayList<String> sequence = new ArrayList<String>();
        sequence.add("start");
        sequence.add("alarm");
        sequence.add("engine boom");
        sequence.add("stop");

        BenzBuilder benzBuilder = new BenzBuilder();
        benzBuilder.setSequence(sequence);
        BenzModel benz = (BenzModel)benzBuilder.getCarModel();
        benz.run();

        BmwBuilder bmwBuilder = new BmwBuilder();
        bmwBuilder.setSequence(sequence);
        BmwModel bmw = (BmwModel)bmwBuilder.getCarModel();
        bmw.run();
    }
}
