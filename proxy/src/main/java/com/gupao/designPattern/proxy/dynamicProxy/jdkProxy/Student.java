package com.gupao.designPattern.proxy.dynamicProxy.jdkProxy;

import com.gupao.designPattern.proxy.IPerson;

/**
 * @Author: wensp
 * @Version: v1.0 2019-3-22
 */
public class Student implements IPerson {
    public void findJob() {
        System.out.println("事少钱多离家近");
    }
}
