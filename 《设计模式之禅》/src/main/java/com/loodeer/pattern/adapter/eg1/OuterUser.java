package com.loodeer.pattern.adapter.eg1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author loodeer
 * @date 2019-02-14 23:40
 */
public class OuterUser  implements IOuterUser{
    public HashMap<String, String> getUserBaseInfo() {
        HashMap<String, String> baseInfoMap = new HashMap<String, String>(2);
        baseInfoMap.put("userName", "这个外包员工叫混世魔王");
        baseInfoMap.put("mobileNumber", "这个外包员工的电话是 ...");
        return baseInfoMap;
    }

    public Map getUserOfficeInfo() {
        HashMap<String, String> officeInfo = new HashMap<String, String>(2);
        officeInfo.put("jobPosition", "这个外包员工的职位是 ...");
        officeInfo.put("officeTelNumber", "这个外包员工的办公电话是 ...");
        return officeInfo;
    }

    public Map getUserHomeInfo() {
        HashMap<String, String> homeInfo = new HashMap<String, String>(2);
        homeInfo.put("homeTelNumber", "这个外包员工的家庭电话是 ...");
        homeInfo.put("homeAddress", "这个外包员工的家庭地址是 ...");
        return homeInfo;
    }

}
