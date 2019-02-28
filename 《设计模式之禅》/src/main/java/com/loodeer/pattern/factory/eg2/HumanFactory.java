package com.loodeer.pattern.factory.eg2;

import com.loodeer.pattern.factory.eg1.AbstractHumanFactory;

/**
 * @author loodeer
 * @date 2019-02-28 23:54
 */
public class HumanFactory {
    public static <T extends Human> T createHuman(Class<T> c) {
        Human human = null;
        try {
            human = (T)Class.forName(c.getName()).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) human;
    }
}
