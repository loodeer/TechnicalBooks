package com.loodeer.pattern.bridge.eg1;

/**
 * @author loodeer
 * @date 2019-02-20 22:48
 */
public class Client {
    public static void main(String[] args) {
        House house = new House();
        System.out.println("--- 房地产公司是这样运行的 ---");
        HouseCorp houseCorp = new HouseCorp(house);
        houseCorp.makeMoney();

        System.out.println("--- 山寨公司是这样运行的 ---");
        ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new IPod());
        shanZhaiCorp.makeMoney();
    }
}
