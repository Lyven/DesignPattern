package com.gupao.designPattern.singleton.serializable;

import java.io.Serializable;

/**
 * @Author: wensp
 * @Version: v1.0 2019-3-19
 */
public class SerializableSingleton implements Serializable {

    private SerializableSingleton(){}

    private static final SerializableSingleton instance = new SerializableSingleton();

    public static SerializableSingleton getInstance(){
        return instance;
    }

    private Object readResolve(){
        return instance;
    }
}
