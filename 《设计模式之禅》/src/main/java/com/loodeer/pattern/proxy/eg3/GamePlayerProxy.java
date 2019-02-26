package com.loodeer.pattern.proxy.eg3;

/**
 * @author loodeer
 * @date 2019-02-26 13:48
 */
public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer gamePlayer = null;

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
    }

    // 代理也可以被其他代理，扩展这里
    public IGamePlayer getProxy() {
        return this;
    }
}
