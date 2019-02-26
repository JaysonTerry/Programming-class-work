package com.company;

/**
 * Created by jt4100 on 2/20/2019.
 */
public class Animal {

    String species;
    String name;

    void SetAnimalInfo(String Species, String Name) {
        species = Species;
        name = Name;
    }

    void MakeSound() {
        System.out.println("Grrrrrrrr");
    }

    void PrintName() {
        System.out.println("My name is " + name);
    }
}
