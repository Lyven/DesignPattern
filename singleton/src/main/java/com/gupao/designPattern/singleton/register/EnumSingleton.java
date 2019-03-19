package com.gupao.designPattern.singleton.register;

/**
 * @Author: wensp
 * @Version: v1.0 2019-3-19
 */
public enum  EnumSingleton {
    Instance;
    public static EnumSingleton getInstance(){
        return Instance;
    }
}
