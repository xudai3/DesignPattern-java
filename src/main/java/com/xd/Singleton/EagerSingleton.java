package com.xd.Singleton;

public class EagerSingleton {

    private EagerSingleton(){}

    private static EagerSingleton instance = new EagerSingleton();

    public static EagerSingleton getInstance() {
        return instance;
    }
}
