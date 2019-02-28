package com.loodeer.pattern.builder.eg1;

import java.util.ArrayList;

/**
 * @author loodeer
 * @date 2019-02-28 23:22
 */
public class BenzBuilder extends CarBuilder{
    private BenzModel benz= new BenzModel();
    @Override public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }

    @Override public CarModel getCarModel() {
        return this.benz;
    }
}
