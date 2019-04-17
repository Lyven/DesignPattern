package com.gupao.designPattern.delegate.simple;

/**
 * @Author: wensp
 * @Version: v1.0 2019-3-26
 */
public class EmployeeA implements IEmployee {
    public void doing(String command) {
        System.out.println("做 "+command + " 任务");
    }
}
