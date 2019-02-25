package com.loodeer.pattern.prototype.common;

/**
 * @author loodeer
 * @date 2019-02-26 00:04
 */
public class PrototypeClass implements Cloneable {

    @Override public PrototypeClass clone() {
        PrototypeClass prototypeClass = null;
        try {
            prototypeClass = (PrototypeClass)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototypeClass;
    }
}
