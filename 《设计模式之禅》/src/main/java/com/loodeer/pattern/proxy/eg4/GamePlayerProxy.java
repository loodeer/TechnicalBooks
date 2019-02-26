package com.loodeer.pattern.proxy.eg4;

/**
 * @author loodeer
 * @date 2019-02-26 13:48
 */
public class GamePlayerProxy implements IGamePlayer,IProxy {
    private IGamePlayer gamePlayer = null;

    // 通过构造函数传递要对谁进行代练
    public GamePlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    public void login(String user, String password) {
        this.gamePlayer.login(user, password);
    }

    public void killBoss() {
        this.gamePlayer.killBoss();
        System.out.println("其实是代练在帮他打怪");
    }

    public void upgrade() {
        this.gamePlayer.upgrade();
        this.count();
    }

    public void count() {
        System.out.println("升级总费用是 150 元");
    }
}
