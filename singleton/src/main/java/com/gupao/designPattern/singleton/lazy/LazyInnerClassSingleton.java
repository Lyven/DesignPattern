package com.gupao.designPattern.singleton.lazy;

/**
 * @Author: wensp
 * @Version: v1.0 2019-3-19
 * 静态内部类模式
 */
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton(){
        if(LazyHolder.LAZY != null){
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    public static final LazyInnerClassSingleton getInstance(){
        return LazyHolder.LAZY;
    }

    private static class LazyHolder{
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}
