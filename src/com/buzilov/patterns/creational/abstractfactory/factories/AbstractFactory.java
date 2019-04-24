package com.buzilov.patterns.creational.abstractfactory.factories;

import com.buzilov.patterns.creational.abstractfactory.model.ObjectType;

public interface AbstractFactory<T> {
    T create(ObjectType type) throws Exception;
}
