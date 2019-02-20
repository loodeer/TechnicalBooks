package com.loodeer.pattern.interpreter.eg1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @author loodeer
 * @date 2019-02-20 23:20
 */
public class Client {
    public static void main(String[] args) throws IOException {
        //cal1();
        System.out.println(cal2());
    }

    public static int cal2() {
        Calculator cal = new Calculator("a+b+c+d-e");
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("a", 10);
        map.put("b", 9);
        map.put("c", 1);
        map.put("e", 20);
        map.put("d", 2);
        return cal.run(map);
    }

    public static void cal1() throws IOException {
        String expStr = getExpStr();
        HashMap<String, Integer> var = getValue(expStr);
        Calculator cal = new Calculator(expStr);
        System.out.println("运算结果为:" + expStr + "=" + cal.run(var));
    }
    // 获得表达式
    public static String getExpStr() throws IOException {
        System.out.println("请输入表达式: ");
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }
    // 获得值映射
    public static HashMap<String, Integer> getValue(String exprStr) throws IOException {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (char ch : exprStr.toCharArray()) {
            if (ch != '+' && ch != '-') {
                System.out.println("请输入" + ch + "的值:");
                // 解决重复参数的问题
                if (!map.containsKey(String.valueOf(ch))) {
                    String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
                    map.put(String.valueOf(ch), Integer.valueOf(in));
                }
            }
        }
        return map;
    }

}
