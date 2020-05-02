package com.rahul.daggercodeinflow.dagger;

import com.rahul.daggercodeinflow.car.DieselEngine;
import com.rahul.daggercodeinflow.car.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {

    @Binds
    abstract Engine bindEngine(DieselEngine engine);

    /*
    we have to write engine1, 2, 3 .... redundant so will optimize it using bind

    @Provides
    Engine provideEngine(PetrolEngine engine) {
        return engine;
    }*/
}
