package com.rahul.daggercodeinflow;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";
    Wheel wheel;
    Engine engine;

    @Inject
    public Car(Wheel wheel, Engine engine) {
        this.wheel = wheel;
        this.engine = engine;
    }

    public void drive() {
        Log.e(TAG, "driving...");
    }
}
