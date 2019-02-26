package com.loodeer.pattern.proxy.eg4;

/**
 * @author loodeer
 * @date 2019-02-26 13:45
 */
public class Client {
    public static void main(String[] args) {
        GamePlayer player = new GamePlayer("张三");
        GamePlayerProxy proxy = new GamePlayerProxy(player);
        proxy.login("zhangsan", "password");
        proxy.killBoss();
        proxy.upgrade();
    }

}
