package com.gupao.designPattern.factory.factoryMethod;

import com.gupao.designPattern.factory.ICourse;
import com.gupao.designPattern.factory.JavaCourse;

/**
 * @Author: wensp
 * @Version: v1.0 2019-3-9
 * Copyright 2019 by landray
 */
public class JavaCourseFactory implements ICourseFactory {
    public ICourse create() {
        return new JavaCourse();
    }
}
