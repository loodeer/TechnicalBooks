package com.loodeer.pattern.singleton.eg2;

import java.util.Random;
import java.util.Vector;

/**
 * @author loodeer
 * @date 2019-02-27 00:09
 * 有上限的多例模式
 */
public class Emperor {
    // 定义最多能产生的实例数量
    private static int maxNumOfEmperor = 4;
    // 每个皇帝都有名字 vector 线程安全
    private static Vector<String> nameVector = new Vector<String>();
    // 定义列表，容纳所有的皇帝实例
    private static Vector<Emperor> emperorVector = new Vector<Emperor>();
    // 当前皇帝序列号
    private static int countNumOfEmperor = 0;
    static {
        for (int i = 0; i < maxNumOfEmperor; i++) {
            emperorVector.add(new Emperor("皇帝" + i));
        }
    }
    private Emperor(){
    }
    private Emperor(String name) {
        nameVector.add(name);
    }
    // 随机获取一个皇帝对象
    public static Emperor getInstance() {
        Random random = new Random();
        countNumOfEmperor = random.nextInt(maxNumOfEmperor);
        return emperorVector.get(countNumOfEmperor);
    }
    // 皇帝发话了
    public static void say() {
        System.out.println(nameVector.get(countNumOfEmperor));
    }
}
