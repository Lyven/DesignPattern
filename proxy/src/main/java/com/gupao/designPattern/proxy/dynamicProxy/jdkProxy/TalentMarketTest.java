package com.gupao.designPattern.proxy.dynamicProxy.jdkProxy;

import java.lang.reflect.Method;

/**
 * @Author: wensp
 * @Version: v1.0 2019-3-22
 */
public class TalentMarketTest {
    public static void main(String[] args) {
        try {
            TalentMarket tm = new TalentMarket();
            Object obj = tm.getInstance(new Student());
            Method method = obj.getClass().getMethod("findJob", null);
            method.invoke(obj);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
