package com.gupao.designPattern.factory.abstractFactory;

/**
 * @Author: wensp
 * @Version: v1.0 2019-3-9
 * Copyright 2019 by landray
 */
public class JavaCourseFactory implements IAbstractCourseFactory {
    public IVideo createVideo() {
        return new JavaVideo();
    }

    public INote createNote() {
        return new JavaNote();
    }

    public ISourseCode createSourseCode(){
        return new JavaSourseCode();
    }

}
