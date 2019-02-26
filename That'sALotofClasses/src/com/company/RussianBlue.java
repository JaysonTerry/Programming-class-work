package com.company;

/**
 * Created by jt4100 on 2/20/2019.
 */
public class RussianBlue {
    String species;
    String name;

    void SetCatInfo(String Name) {
        species = "Cat";
        name = Name;
    }

    void MakeSound() {
        System.out.println("Hissssss");
    }

    void PrintName() {
        System.out.println("My name is " + name);
    }

    void BeHappy() {
        System.out.println("purrrr");
        SeeLaser();
    }
    void SeeLaser() {
        System.out.println("*cat pounces*");
    }

}
