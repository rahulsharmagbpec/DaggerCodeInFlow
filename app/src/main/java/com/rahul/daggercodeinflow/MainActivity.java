package com.rahul.daggercodeinflow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.rahul.daggercodeinflow.car.Car;
import com.rahul.daggercodeinflow.dagger.CarComponent;
import com.rahul.daggercodeinflow.dagger.DaggerCarComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent carComponent = DaggerCarComponent.create();
        carComponent.inject(this);
        //car = carComponent.getCar();
        car.drive();
    }
}
