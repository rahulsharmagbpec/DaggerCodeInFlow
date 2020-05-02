package com.rahul.daggercodeinflow.dagger;

import com.rahul.daggercodeinflow.car.Rims;
import com.rahul.daggercodeinflow.car.Tyres;
import com.rahul.daggercodeinflow.car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelModule {
    @Provides
    static Rims provideRims() {
        return new Rims();
    }

    @Provides
    static Tyres provideTyres() {
        Tyres tyres = new Tyres();
        tyres.inflate();
        return tyres;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tyres tyres) {
        return new Wheels(rims, tyres);
    }
}
