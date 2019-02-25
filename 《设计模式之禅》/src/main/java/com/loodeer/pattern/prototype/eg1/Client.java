package com.loodeer.pattern.prototype.eg1;

import java.util.Random;

/**
 * @author loodeer
 * @date 2019-02-26 00:11
 */
public class Client {
    private static int MAX_COUNT = 6;
    public static void main(String[] args) {
        int i = 0;
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("XX银行版权所有");
        while (i<MAX_COUNT) {
            // 线程安全
            Mail cloneMail = mail.clone();
            cloneMail.setAppellation(getRandString(5) + " 先生（女士）");
            cloneMail.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");
            sendMail(cloneMail);
            i++;
        }
    }
    public static void sendMail(Mail mail) {
        System.out.println("标题:" + mail.getSubject() + "收件人:" + mail.getReceiver() + "...发送成功");
    }
    public static String getRandString(int maxLength) {
        String source = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < maxLength; i++) {
            sb.append(source.charAt(random.nextInt(source.length())));
        }
        return sb.toString();
    }
}
