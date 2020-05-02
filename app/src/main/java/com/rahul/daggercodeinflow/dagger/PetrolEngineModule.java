package com.rahul.daggercodeinflow.dagger;

import com.rahul.daggercodeinflow.car.Engine;
import com.rahul.daggercodeinflow.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);

    /*
    we have to write engine1, 2, 3 .... redundant so will optimize it using bind

    @Provides
    Engine provideEngine(PetrolEngine engine) {
        return engine;
    }*/
}
