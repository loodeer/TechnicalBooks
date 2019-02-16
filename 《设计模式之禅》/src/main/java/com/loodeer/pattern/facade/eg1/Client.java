package com.loodeer.pattern.facade.eg1;

/**
 * @author loodeer
 * @date 2019-02-16 22:17
 */
public class Client {
    public static void main(String[] args) {
        ModernPostOffice modernPostOffice = new ModernPostOffice();
        String context = "SOS";
        String address = "his address";
        modernPostOffice.sendLetter(context, address);
    }
}
