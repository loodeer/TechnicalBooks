package com.loodeer.pattern.proxy.eg2;

/**
 * @author loodeer
 * @date 2019-02-26 13:48
 */
public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer gamePlayer = null;

    // 普通代理，只能通过代理类访问真实角色，不能直接访问真实角色
    public GamePlayerProxy(String name) {
        try {
            gamePlayer = new GamePlayer(this, name);
        } catch (Exception e) {
            e.printStackTrace();
        }
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
}
