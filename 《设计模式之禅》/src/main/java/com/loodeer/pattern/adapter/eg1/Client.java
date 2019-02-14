package com.loodeer.pattern.adapter.eg1;

/**
 * @author loodeer
 * @date 2019-02-14 23:56
 */
public class Client {
    public static void main(String[] args) {
        // 没有与外部系统连接时，这样写
        IUserInfo youngGirl = new UserInfo();
        // 老板要 10 个漂亮 MM 的电话号码
        for (int i = 0; i < 10; i++) {
            youngGirl.getMobileNumber();
        }
        // 老板一想，兔子不吃窝边草，找外包员工比较好
        IUserInfo outYoungGirl = new OuterUserInfo();
        for (int i = 0; i < 10; i++) {
            outYoungGirl.getMobileNumber();
        }
        // 通过适配器，只要改一下 new 的对象，就解决了问题。
    }
}
