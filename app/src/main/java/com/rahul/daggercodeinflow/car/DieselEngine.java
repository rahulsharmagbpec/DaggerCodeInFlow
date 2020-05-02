package com.rahul.daggercodeinflow.car;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine {

    private static final String TAG = "DieselEngine";
    int horsePower;

    public DieselEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void start() {
        Log.e(TAG, "diesel engine start, horsePower : " + horsePower);
    }
}
