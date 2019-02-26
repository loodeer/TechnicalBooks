package com.loodeer.pattern.proxy.eg2;

/**
 * @author loodeer
 * @date 2019-02-26 13:43
 *
 */
public class GamePlayer implements IGamePlayer {
    private String name = "";

    // 普通代理，不能访问真实角色
    public GamePlayer(IGamePlayer gamePlayer, String name) throws Exception {
        // 此处可以增加其他限制，比如类目是否是 proxy 类
        if (gamePlayer == null) {
            throw new Exception("不能创建正式角色");
        } else {
            this.name = name;
        }
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
