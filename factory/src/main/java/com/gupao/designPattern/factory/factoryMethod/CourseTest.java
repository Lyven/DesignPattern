package com.gupao.designPattern.factory.factoryMethod;

/**
 * @Author: wensp
 * @Version: v1.0 2019-3-9
 * Copyright 2019 by landray
 */
public class CourseTest {
    public static void main(String[] args) {
        ICourseFactory cfj = new JavaCourseFactory();
        cfj.create().record();

        ICourseFactory cfp = new PythonCourseFactory();
        cfp.create().record();
    }
}
