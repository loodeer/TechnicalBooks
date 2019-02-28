package com.loodeer.pattern.builder.common;

/**
 * @author loodeer
 * @date 2019-02-28 23:40
 */
public abstract class Builder {
    // 设置产品的不同部分
    public abstract void setPart();
    public abstract Product buildProduct();
}
