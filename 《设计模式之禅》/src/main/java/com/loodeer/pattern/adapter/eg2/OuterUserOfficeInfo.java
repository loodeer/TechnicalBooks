package com.loodeer.pattern.adapter.eg2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author loodeer
 * @date 2019-02-15 00:04
 */
public class OuterUserOfficeInfo implements IOuterUserOfficeInfo {
    public Map getUserOfficeInfo() {
        HashMap<String, String> officeInfo = new HashMap<String, String>(2);
        officeInfo.put("jobPosition", "这个外包员工的职位是 ...");
        officeInfo.put("officeTelNumber", "这个外包员工的办公电话是 ...");
        return officeInfo;
    }
}
