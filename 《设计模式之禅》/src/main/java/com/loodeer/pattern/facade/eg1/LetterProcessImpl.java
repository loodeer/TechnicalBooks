package com.loodeer.pattern.facade.eg1;

/**
 * @author loodeer
 * @date 2019-02-16 22:14
 */
public class LetterProcessImpl implements ILetterProcess {
    public void writeContext(String context) {
        System.out.println("填写信的内容..." + context);
    }

    public void fillEnvelope(String address) {
        System.out.println("填写收件人地址及姓名..." + address);
    }

    public void letterInotoEnvelope() {
        System.out.println("把信放到信封里...");
    }

    public void sendLetter() {
        System.out.println("邮寄信件...");
    }
}
