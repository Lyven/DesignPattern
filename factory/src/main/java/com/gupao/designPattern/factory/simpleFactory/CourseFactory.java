package com.gupao.designPattern.factory.simpleFactory;

import com.gupao.designPattern.factory.ICourse;
import com.gupao.designPattern.factory.JavaCourse;
import com.gupao.designPattern.factory.PythonCourse;

/**
 * @Author: wensp
 * @Version: v1.0 2019-3-9
 * Copyright 2019 by landray
 */
public class CourseFactory {
    public ICourse create1(String courseName){
        if("Java".equals(courseName)){
            return new JavaCourse();
        }else if("Python".equals(courseName)){
            return new PythonCourse();
        }else{
            return null;
        }
    }

    public ICourse create2(String className){

        try {
            if(className != null && className != ""){
                 return (ICourse) Class.forName(className).newInstance();
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
         return null;
    }

    public ICourse create3(Class<? extends ICourse> clazz){
        try {
            if(clazz != null) {
               return clazz.newInstance();
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return  null;
    }
}
