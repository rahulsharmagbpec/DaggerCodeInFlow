package com.rahul.daggercodeinflow.car;

/*
 *suppose wheels class is external library, and we cannot edit this
 */
public class Wheels {

    private Rims rims;
    private Tyres tyres;

    public Wheels(Rims rims, Tyres tyres) {
        this.rims = rims;
        this.tyres = tyres;
    }
}
