package com.gupao.designPattern.factory.abstractFactory;

/**
 * @Author: wensp
 * @Version: v1.0 2019-3-9
 * Copyright 2019 by landray
 */
public interface IAbstractCourseFactory {
    IVideo createVideo();
    INote createNote();
    ISourseCode createSourseCode();
}
