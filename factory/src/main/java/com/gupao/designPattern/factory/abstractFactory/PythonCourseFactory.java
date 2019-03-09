package com.gupao.designPattern.factory.abstractFactory;

/**
 * @Author: wensp
 * @Version: v1.0 2019-3-9
 * Copyright 2019 by landray
 */
public class PythonCourseFactory implements IAbstractCourseFactory {
    public IVideo createVideo() {
        return new PythonVideo();
    }

    public INote createNote() {
        return new PythonNote();
    }

    public ISourseCode createSourseCode() {
        return new PythonSourseCode();
    }

}
