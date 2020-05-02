package com.rahul.daggercodeinflow.car;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";

    @Inject
    Wheels wheel;
    Engine engine;

    @Inject
    public Car(Engine engine) {
        this.engine = engine;
    }

    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }

    public void drive() {
        engine.start();
        Log.e(TAG, "driving...");
    }
}
