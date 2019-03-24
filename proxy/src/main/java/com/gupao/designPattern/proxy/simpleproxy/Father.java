package com.gupao.designPattern.proxy.simpleproxy;

import com.gupao.designPattern.proxy.IPerson;

/**
 * @Author: wensp
 * @Version: v1.0 2019-3-21
 */
public class Father implements IPerson {
    private Son son;
    public Father(Son son){
        this.son = son;
    }

    public void findJob() {
        System.out.println("帮忙筛选合适的招聘单位");
        son.findJob();
        System.out.println("找到工作后准备庆祝");
    }
}
