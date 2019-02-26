package com.loodeer.pattern.template.common;

/**
 * @author loodeer
 * @date 2019-02-26 23:46
 */
public class Client {
    public static void main(String[] args) {
        AbstractClass class1 = new ConcreteClass1();
        AbstractClass class2 = new ConcreteClass2();
        // 调用模板方法
        class1.templateMethod();
        class2.templateMethod();
    }
}
