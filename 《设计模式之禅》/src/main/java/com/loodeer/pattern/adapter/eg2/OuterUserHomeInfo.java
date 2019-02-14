package com.loodeer.pattern.adapter.eg2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author loodeer
 * @date 2019-02-15 00:04
 */
public class OuterUserHomeInfo implements IOuterUserHomeInfo {
    public Map getUserHomeInfo() {
        HashMap<String, String> homeInfo = new HashMap<String, String>(2);
        homeInfo.put("homeTelNumber", "这个外包员工的家庭电话是 ...");
        homeInfo.put("homeAddress", "这个外包员工的家庭地址是 ...");
        return homeInfo;
    }
}
