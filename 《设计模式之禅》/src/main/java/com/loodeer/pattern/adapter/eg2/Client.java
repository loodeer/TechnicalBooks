package com.loodeer.pattern.adapter.eg2;


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
        // 外包人员信息
        IOuterUserBaseInfo outerUserBaseInfo = new OuterUserBaseInfo();
        IOuterUserHomeInfo outerUserHomeInfo = new OuterUserHomeInfo();
        IOuterUserOfficeInfo outerUserOfficeInfo = new OuterUserOfficeInfo();
        IUserInfo outYoungGirl = new OuterUserInfo(outerUserBaseInfo, outerUserHomeInfo, outerUserOfficeInfo);
        for (int i = 0; i < 10; i++) {
            outYoungGirl.getMobileNumber();
        }
        // eg1 是类适配器，这里是对象适配器，
    }
}
