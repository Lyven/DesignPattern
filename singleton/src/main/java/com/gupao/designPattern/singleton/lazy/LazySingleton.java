package com.gupao.designPattern.singleton.lazy;

/**
 * @Author: wensp
 * @Version: v1.0 2019-3-19
 */
public class LazySingleton {
    private LazySingleton(){}

    /**
     * 简单模式，有线程安全问题
     * @return
     */
    private static LazySingleton instance = null;
    public static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
