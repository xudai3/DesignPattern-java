package com.xd.Singleton;

public class DoubleCheckIdlerSingleton {

    private DoubleCheckIdlerSingleton(){}

    private static DoubleCheckIdlerSingleton instance = null;

    public static DoubleCheckIdlerSingleton getInstance() {

        if (instance == null) {
            synchronized (DoubleCheckIdlerSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckIdlerSingleton();
                }
            }
        }

        return instance;
    }
}
