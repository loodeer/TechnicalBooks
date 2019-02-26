package com.loodeer.pattern.proxy.eg5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author loodeer
 * @date 2019-02-26 13:45
 */
public class Client {
    public static void main(String[] args) {
        v1();
    }

    private static void v1() {
        IGamePlayer player = new GamePlayer("张三");
        InvocationHandler handler = new GamePlayIH(player);
        ClassLoader cl = player.getClass().getClassLoader();
        // 动态生成一个代理者
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl, new Class[]{IGamePlayer.class}, handler);

        proxy.login("zhangsan", "password");
        proxy.killBoss();
        proxy.upgrade();

    }

}
