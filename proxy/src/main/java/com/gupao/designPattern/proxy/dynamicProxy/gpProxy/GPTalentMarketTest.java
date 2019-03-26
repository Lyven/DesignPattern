package com.gupao.designPattern.proxy.dynamicProxy.gpProxy;

import com.gupao.designPattern.proxy.dynamicProxy.jdkProxy.Student;
import com.gupao.designPattern.proxy.dynamicProxy.jdkProxy.TalentMarket;

import java.lang.reflect.Method;

/**
 * @Author: wensp
 * @Version: v1.0 2019-3-25
 */
public class GPTalentMarketTest {
    public static void main(String[] args) {
        try {
            GPTalentMarket tm = new GPTalentMarket();
            Object obj = tm.getInstance(new Student());
            Method method = obj.getClass().getMethod("findJob", null);
            method.invoke(obj);

//            byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{obj.getClass()});
//            FileOutputStream fos = new FileOutputStream("D://$Proxy0.class");
//            fos.write(bytes);
//            fos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
