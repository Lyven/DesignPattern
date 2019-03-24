package com.gupao.designPattern.proxy.simpleproxy;

/**
 * @Author: wensp
 * @Version: v1.0 2019-3-21
 */
public class ClientTest {
    public static void main(String[] args) {
        Father father = new Father(new Son());
        father.findJob();
    }
}
