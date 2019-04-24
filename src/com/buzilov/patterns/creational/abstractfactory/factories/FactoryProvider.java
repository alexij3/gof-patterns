package com.buzilov.patterns.creational.abstractfactory.factories;

public class FactoryProvider {
    public static AbstractFactory getFactory(FactoryType factoryType) {
        switch(factoryType) {
            case USER:
                return new UserFactory();
            case EVENT:
                return new EventFactory();
            default:
                throw new IllegalArgumentException("You have specified wrong factory type!");
        }
    }
}
