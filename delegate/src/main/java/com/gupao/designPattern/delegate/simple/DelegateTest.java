package com.gupao.designPattern.delegate.simple;

/**
 * @Author: wensp
 * @Version: v1.0 2019-3-26
 */
public class DelegateTest {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.wantdo("lock");

        boss.wantdo("unlock");
    }
}
