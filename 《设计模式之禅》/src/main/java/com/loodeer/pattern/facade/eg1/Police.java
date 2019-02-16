package com.loodeer.pattern.facade.eg1;

/**
 * @author loodeer
 * @date 2019-02-16 22:19
 */
public class Police {
    public void checkLetter(ILetterProcess letterProcess) {
        System.out.println(letterProcess + " 信件已经检查过了...");
    }
}
