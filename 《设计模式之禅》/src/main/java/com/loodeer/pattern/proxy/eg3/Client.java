package com.loodeer.pattern.proxy.eg3;

/**
 * @author loodeer
 * @date 2019-02-26 13:45
 */
public class Client {
    public static void main(String[] args) {

        System.out.println("---强制代理模式，这样访问不了---");
        IGamePlayer gamePlayer = new GamePlayer("张三");
        gamePlayer.login("zhangsan", "password");
        gamePlayer.killBoss();
        gamePlayer.upgrade();

        System.out.println("---强制代理模式，这样访问不了---");
        GamePlayerProxy proxy = new GamePlayerProxy(gamePlayer);
        proxy.login("zhangsan", "password");
        proxy.killBoss();
        proxy.upgrade();

        System.out.println("---强制代理模式，要这样访问才行---");
        IGamePlayer proxy1 = gamePlayer.getProxy();
        proxy.login("zhangsan", "password");
        proxy.killBoss();
        proxy.upgrade();
    }

}
