package com.xd.Singleton;

public class StaticNestedClassIdlerSingleton {

    private StaticNestedClassIdlerSingleton(){}

    private static class SingletonHolder {
        private static final StaticNestedClassIdlerSingleton instance = new StaticNestedClassIdlerSingleton();
    }

    public static final StaticNestedClassIdlerSingleton getInstance() {
        return SingletonHolder.instance;
    }
}
