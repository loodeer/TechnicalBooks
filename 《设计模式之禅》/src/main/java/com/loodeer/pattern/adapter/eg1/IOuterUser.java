package com.loodeer.pattern.adapter.eg1;

import java.util.Map;

public interface IOuterUser {
    // 基本信息，如姓名、手机号、性别等
    public Map getUserBaseInfo();
    // 工作信息
    public Map getUserOfficeInfo();
    // 家庭信息
    public Map getUserHomeInfo();
}
