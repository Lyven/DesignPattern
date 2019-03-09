package com.gupao.designPattern.factory.simpleFactory;

import com.gupao.designPattern.factory.ICourse;
import com.gupao.designPattern.factory.JavaCourse;

/**
 * @Author: wensp
 * @Version: v1.0 2019-3-9
 * Copyright 2019 by landray
 */
public class CourseTest {
    public static void main(String[] args) {
        CourseFactory cf = new CourseFactory();
        ICourse course1 = cf.create1("Java");
        course1.record();

        ICourse course2 = cf.create2("com.gupao.designPattern.factory.JavaCourse");
        course2.record();

        ICourse course3 = cf.create3(JavaCourse.class);
        course3.record();
    }
}
