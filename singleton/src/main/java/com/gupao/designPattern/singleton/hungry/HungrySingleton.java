package com.gupao.designPattern.singleton.hungry;

/**
 * @Author: wensp
 * @Version: v1.0 2019-3-19
 */
public class HungrySingleton {
    private HungrySingleton(){}
    //第一种
    private static final HungrySingleton instance = new HungrySingleton();

    public static HungrySingleton getInstance(){
        return instance;
    }
}
