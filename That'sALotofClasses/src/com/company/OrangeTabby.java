package com.company;

/**
 * Created by jt4100 on 2/20/2019.
 */
public class OrangeTabby {
    String species;
    String name;

    void SetCatInfo(String Name) {
        species = "Cat";
        name = Name;
    }

    void MakeSound() {
        System.out.println("Meow");
    }

    void BeHappy() {
        LayOnLap();
        System.out.println("*takes a nap*");
    }
    void PrintName() {
        System.out.println("My name is " + name);
    }

    void SeeLaser() {
        System.out.println("*cat pounces*");
    }

    void LayOnLap() {
        System.out.println("cuddles on owner's lap");
    }
}
