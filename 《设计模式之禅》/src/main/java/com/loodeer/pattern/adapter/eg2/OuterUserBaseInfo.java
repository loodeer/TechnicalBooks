package com.loodeer.pattern.adapter.eg2;

import java.util.HashMap;

/**
 * @author loodeer
 * @date 2019-02-15 00:02
 */
public class OuterUserBaseInfo implements IOuterUserBaseInfo{
    public HashMap<String, String> getUserBaseInfo() {
        HashMap<String, String> baseInfoMap = new HashMap<String, String>(2);
        baseInfoMap.put("userName", "这个外包员工叫混世魔王");
        baseInfoMap.put("mobileNumber", "这个外包员工的电话是 ...");
        return baseInfoMap;
    }
}
