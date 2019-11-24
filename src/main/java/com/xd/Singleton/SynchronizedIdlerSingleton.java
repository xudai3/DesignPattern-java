package com.xd.Singleton;

public class SynchronizedIdlerSingleton {

    private SynchronizedIdlerSingleton(){}

    private static SynchronizedIdlerSingleton instance = null;

    public static synchronized SynchronizedIdlerSingleton getInstance() {

        if (instance == null)
            instance = new SynchronizedIdlerSingleton();
        return instance;
    }


}
