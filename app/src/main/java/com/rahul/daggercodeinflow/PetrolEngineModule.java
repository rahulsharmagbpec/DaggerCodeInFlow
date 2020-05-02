package com.rahul.daggercodeinflow;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

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
