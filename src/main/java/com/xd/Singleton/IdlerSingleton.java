package com.xd.Singleton;

public class IdlerSingleton {

    private IdlerSingleton(){}

    private static IdlerSingleton instance = null;

    public static IdlerSingleton getInstance() {

        if (instance == null)
            instance = new IdlerSingleton();
        return instance;
    }
}
