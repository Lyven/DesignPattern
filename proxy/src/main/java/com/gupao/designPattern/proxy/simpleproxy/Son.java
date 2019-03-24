package com.gupao.designPattern.proxy.simpleproxy;

import com.gupao.designPattern.proxy.IPerson;

/**
 * @Author: wensp
 * @Version: v1.0 2019-3-21
 */
public class Son implements IPerson {
    public void findJob() {
        System.out.println("去面试");
    }
}
