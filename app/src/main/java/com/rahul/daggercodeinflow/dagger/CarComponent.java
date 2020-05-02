package com.rahul.daggercodeinflow.dagger;

import com.rahul.daggercodeinflow.MainActivity;
import com.rahul.daggercodeinflow.car.Car;

import dagger.Component;

@Component(modules = {WheelModule.class, PetrolEngineModule.class})
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);
}
