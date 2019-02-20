package com.loodeer.pattern.bridge.eg1;

/**
 * @author loodeer
 * @date 2019-02-20 22:47
 */
public class ShanZhaiCorp extends Corp {
    // 产什么产品不知道，只有被调用是才知道
    public ShanZhaiCorp(Product product) {
        super(product);
    }
    @Override public void makeMoney() {
        super.makeMoney();
        System.out.println("山寨公司赚大钱了 ...");
    }
}
