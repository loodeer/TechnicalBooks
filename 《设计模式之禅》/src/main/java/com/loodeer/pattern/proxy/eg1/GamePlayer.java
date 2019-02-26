package com.loodeer.pattern.proxy.eg1;

/**
 * @author loodeer
 * @date 2019-02-26 13:43
 */
public class GamePlayer implements IGamePlayer {
    private String name = "";

    public GamePlayer(String name) {
        this.name = name;
    }

    public void login(String user, String password) {
        System.out.println("登录名为" + user + "的用户," + this.name + "登陆成功");
    }

    public void killBoss() {
        System.out.println(this.name + "在打怪!");
    }

    public void upgrade() {
        System.out.println(this.name + "又升级了");
    }
}
