package com.loodeer.pattern.prototype.eg1;

/**
 * @author loodeer
 * @date 2019-02-26 00:06
 */
public class Mail implements Cloneable {
    // 收件人
    private String receiver;
    // 邮件名称
    private String subject;
    // 称谓
    private String appellation;
    // 邮件内容
    private String context;
    // 签名
    private String tail;

    public Mail(AdvTemplate advTemplate) {
        this.context = advTemplate.getAdvContent();
        this.subject = advTemplate.getAdvSubject();
    }

    @Override
    public Mail clone() {
        // 解决多线程不安全问题
        Mail mail = null;
        try {
            mail = (Mail) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return mail;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAppellation() {
        return appellation;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }
}
