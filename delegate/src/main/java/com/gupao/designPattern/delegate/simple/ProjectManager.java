package com.gupao.designPattern.delegate.simple;

import java.util.HashMap;

/**
 * @Author: wensp
 * @Version: v1.0 2019-3-26
 */
public class ProjectManager implements IEmployee {

    public static final HashMap<String,IEmployee> map = new HashMap<String, IEmployee>();
    static{
        map.put("lock",new EmployeeA());
        map.put("unlock",new EmpolyeeB());
    }

    public void doing(String command) {
        map.get(command).doing(command);
    }
}
