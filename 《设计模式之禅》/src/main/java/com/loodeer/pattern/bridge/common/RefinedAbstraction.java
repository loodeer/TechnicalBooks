package com.loodeer.pattern.bridge.common;

/**
 * @author loodeer
 * @date 2019-02-20 22:56
 */
public class RefinedAbstraction extends Abstraction{
    public RefinedAbstraction(Implementor impl) {
        super(impl);
    }
    // 修正父类的行为
    @Override public void request() {
        super.request();
        super.getImpl().doAnything();
    }
}
