package com.company;

/**
 * Created by jt4100 on 2/21/2019.
 */
public class Garfield {
    String species;
    String name;

    void SetCatInfo() {
        species = "cat";
        name = "Garfield";
    }

    void MakeSound() {
        System.out.println("mmmm, lasagna");
    }

    void PrintName() {
        System.out.println("My name is " + name);
    }

    void BeHappy() {
        LayOnLap();
        System.out.println("*takes a nap*");
    }

    void LayOnLap() {
        System.out.println("cuddles on owner's lap");
    }

    void SeeLaser() {
        BeHappy();
}

    void KickOdieOffTheTable() {
        System.out.println("time to kick odie of the table");
    }
}
