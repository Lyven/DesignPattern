package com.gupao.designPattern.singleton.hungry;

/**
 * @Author: wensp
 * @Version: v1.0 2019-3-19
 */
public class HungryStaticSingleton {
    private static final HungryStaticSingleton instance;
    private HungryStaticSingleton(){}

    static{
        instance = new HungryStaticSingleton();
    }

    public static HungryStaticSingleton getInstance(){
        return instance;
    }

}
