package com.loodeer.pattern.proxy.eg2;

/**
 * @author loodeer
 * @date 2019-02-26 13:45
 */
public class Client {
    public static void main(String[] args) {
        GamePlayerProxy proxy = new GamePlayerProxy("张三");
        proxy.login("zhangsan", "password");
        proxy.killBoss();
        proxy.upgrade();
    }

}
