package com.loodeer.pattern.builder.eg1;

import java.util.ArrayList;

/**
 * @author loodeer
 * @date 2019-02-28 23:21
 */
public abstract class CarBuilder {
    public abstract void setSequence(ArrayList<String> sequence);
    public abstract CarModel getCarModel();
}
