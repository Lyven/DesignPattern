package com.gupao.designPattern.singleton.lazy;

/**
 * @Author: wensp
 * @Version: v1.0 2019-3-19
 * 双重检查锁模式
 */
public class LazyDoubleCheckSingleton {
    private static LazyDoubleCheckSingleton instance = null;
    private LazyDoubleCheckSingleton(){}
    public static LazyDoubleCheckSingleton getInstance(){
        if(instance == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(instance == null){
                    instance = new LazyDoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
