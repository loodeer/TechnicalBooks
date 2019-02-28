package com.loodeer.pattern.builder.eg1;

import java.util.ArrayList;

/**
 * @author loodeer
 * @date 2019-02-28 23:24
 */
public class BmwBuilder extends CarBuilder{
    private BmwModel bmw = new BmwModel();
    @Override public void setSequence(ArrayList<String> sequence) {
        this.bmw.setSequence(sequence);
    }

    @Override public CarModel getCarModel() {
        return this.bmw;
    }
}
