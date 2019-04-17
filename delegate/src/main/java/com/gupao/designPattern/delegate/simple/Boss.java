package com.gupao.designPattern.delegate.simple;

/**
 * @Author: wensp
 * @Version: v1.0 2019-3-26
 */
public class Boss {
    private static final ProjectManager pm = new ProjectManager();

    public void wantdo(String command){
        pm.doing(command);
    }
}
