package com.loodeer.pattern.adapter.eg2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author loodeer
 * @date 2019-02-14 23:48
 */
public class OuterUserInfo implements IUserInfo{
    private HashMap<String, String> baseInfo = null;
    private Map homeInfo = null;
    private Map officeInfo = null;

    public OuterUserInfo(IOuterUserBaseInfo outerUserBaseInfo, IOuterUserHomeInfo outerUserHomeInfo, IOuterUserOfficeInfo outerUserOfficeInfo) {
        this.baseInfo = outerUserBaseInfo.getUserBaseInfo();
        this.homeInfo = outerUserHomeInfo.getUserHomeInfo();
        this.officeInfo = outerUserOfficeInfo.getUserOfficeInfo();
    }

    public String getUserName() {
        String userName = this.baseInfo.get("userName");
        System.out.println(userName);
        return userName;
    }

    public String getHomeAddress() {
        String homeAddress = (String)this.homeInfo.get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }

    public String getMobileNumber() {
        String mobileNumber = this.baseInfo.get("mobileNumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }

    public String getOfficeTelNumber() {
        String officeTelNumber = (String)this.officeInfo.get("officeTelNumber");
        System.out.println(officeTelNumber);
        return officeTelNumber;
    }

    public String getJobPosition() {
        String jobPosition = (String)this.officeInfo.get("jobPosition");
        System.out.println(jobPosition);
        return jobPosition;
    }

    public String getHomeTelNumber() {
        String homeTelNumber = (String)this.homeInfo.get("homeTelNumber");
        System.out.println(homeTelNumber);
        return homeTelNumber;
    }
}
