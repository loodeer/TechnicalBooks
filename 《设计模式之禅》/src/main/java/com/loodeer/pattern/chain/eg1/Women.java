package com.loodeer.pattern.chain.eg1;

/**
 * @author loodeer
 * @date 2019-02-14 10:07
 */
public class Women implements IWomen {
    /**
     * 1 -- 未出嫁
     * 2 -- 出嫁
     * 3 -- 夫死
     * 未嫁从父，既嫁从夫，夫死从子
     */
    private int type = 0;
    private String request = "";

    public Women(int type, String request) {
        this.type = type;
        switch (this.type) {
        case 1:
            this.request = "女儿的请求是：" + request;
            break;
        case 2:
            this.request = "妻子的请求是：" + request;
            break;
        case 3:
            this.request = "母亲的请求是：" + request;
            break;
        default:
            this.request = request;
        }
    }

    public int getType() {
        return this.type;
    }

    public String getRequest() {
        return this.request;
    }
}

