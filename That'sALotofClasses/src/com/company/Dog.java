package com.company;

/**
 * Created by jt4100 on 2/20/2019.
 */
public class Dog {
    String species;
    String name;
    boolean dockedTail;

    void SetDoggoInfo(String Name, boolean DockedTail) {
        species = "Dog";
        name = Name;
        dockedTail = DockedTail;
    }

    void MakeSound() {
        System.out.println("Woof");
    }
    void PrintName() {
        System.out.println("My name is " + name);
    }
    void PlayFetch() {
        System.out.println("*chases ball 5 times than quits*");
    }
    boolean getDockedTail() {
        return dockedTail;
    }
}
