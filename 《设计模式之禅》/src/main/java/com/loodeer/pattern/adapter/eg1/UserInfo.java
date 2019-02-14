package com.loodeer.pattern.adapter.eg1;

/**
 * @author loodeer
 * @date 2019-02-14 23:35
 */
public class UserInfo implements IUserInfo{
    public String getUserName() {
        System.out.println("这个内部员工的姓名是 ...");
        return null;
    }

    public String getHomeAddress() {
        System.out.println("这个内部员工的家庭住址是 ...");
        return null;
    }

    public String getMobileNumber() {
        System.out.println("这个内部员工的电话号码是 ...");
        return null;
    }

    public String getOfficeTelNumber() {
        System.out.println("这个内部员工的办公室电话号码是 ...");
        return null;
    }

    public String getJobPosition() {
        System.out.println("这个内部员工的职位是 ...");
        return null;
    }

    public String getHomeTelNumber() {
        System.out.println("这个内部员工的家庭电话是 ...");
        return null;
    }
}
