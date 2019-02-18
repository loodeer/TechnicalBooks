package com.loodeer.pattern.chain.common;

/**
 * @author loodeer
 * @date 2019-02-18 23:48
 */
public class Client {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();

        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);

        Request request = new Request();

        Response response = handler1.handleMessage(request);
    }
}
