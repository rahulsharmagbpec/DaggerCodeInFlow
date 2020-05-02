package com.rahul.daggercodeinflow;

import dagger.Component;

@Component(modules = WheelModule.class)
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);
}
