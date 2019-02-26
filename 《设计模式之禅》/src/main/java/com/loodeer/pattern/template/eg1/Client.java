package com.loodeer.pattern.template.eg1;

/**
 * @author loodeer
 * @date 2019-02-26 23:49
 */
public class Client {
    public static void main(String[] args) {
        HummerModel h1 = new HummerH1Model();
        h1.run();

        HummerModel h2 = new HummerH2Model();
        h2.run();
    }
}
