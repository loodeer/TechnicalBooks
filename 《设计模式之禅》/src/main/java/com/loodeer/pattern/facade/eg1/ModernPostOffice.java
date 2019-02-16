package com.loodeer.pattern.facade.eg1;

/**
 * @author loodeer
 * @date 2019-02-16 22:13
 */
public class ModernPostOffice {
    private ILetterProcess letterProcess = new LetterProcessImpl();
    private Police letterPolice = new Police();
    // 写信，封装，投递 一体化
    public void sendLetter(String context, String address) {
        letterProcess.writeContext(context);
        letterProcess.fillEnvelope(address);
        // 增加警察检查信件，高层无需改动
        letterPolice.checkLetter(letterProcess);
        letterProcess.letterInotoEnvelope();
        letterProcess.sendLetter();
    }
}
