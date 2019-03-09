package com.gupao.designPattern.factory.abstractFactory;

/**
 * @Author: wensp
 * @Version: v1.0 2019-3-9
 * Copyright 2019 by landray
 */
public class CourseFactoryTest {
    public static void main(String[] args) {
        IAbstractCourseFactory cfj = new JavaCourseFactory();
        cfj.createNote().edit();
        cfj.createVideo().record();
        cfj.createSourseCode().coding();

        IAbstractCourseFactory cfp = new PythonCourseFactory();
        cfp.createVideo().record();
        cfp.createNote().edit();
        cfp.createSourseCode().coding();
    }
}
