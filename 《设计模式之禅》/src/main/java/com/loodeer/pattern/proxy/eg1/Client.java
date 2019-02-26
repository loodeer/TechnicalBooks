package com.loodeer.pattern.proxy.eg1;

import java.text.DateFormat;

/**
 * @author loodeer
 * @date 2019-02-26 13:45
 */
public class Client {
    public static void main(String[] args) {
        noProxy();
        useProxy();
    }

    private static void noProxy() {
        GamePlayer player = new GamePlayer("张三");
        player.login("zhangsan", "password");
        player.killBoss();
        player.upgrade();
    }

    private static void useProxy() {
        GamePlayer player = new GamePlayer("张三");
        GamePlayerProxy proxy = new GamePlayerProxy(player);
        proxy.login("zhangsan", "password");
        proxy.killBoss();
        proxy.upgrade();
    }
}
