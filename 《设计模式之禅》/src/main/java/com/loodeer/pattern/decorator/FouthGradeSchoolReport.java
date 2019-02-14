package com.loodeer.pattern.decorator;

/**
 * @author loodeer
 * @date 2019-02-14 00:24
 */
public class FouthGradeSchoolReport extends SchoolReport {
    @Override
    public void report() {
        System.out.println("尊敬的XXX家长");
        System.out.println(" ...... ");
        System.out.println(" 语文 60 数学 60 英语 60");
        System.out.println(" ...... ");
        System.out.println("请家长签名");
    }

    @Override
    public void sign(String name) {
        System.out.println("家长的签名为：" + name);
    }
}
