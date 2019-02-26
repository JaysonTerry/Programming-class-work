package com.company;

/**
 * Created by jt4100 on 2/14/2019.
 */
public class Animal {
    String species;
    String name;
    String color;
    int age = 0;


     void AnimalInfo(String Species, String Name, String Color, int Age ) {
         species = Species;
         name = Name;
         color = Color;
         age = Age;
     }
    static void MakeSound() {
        System.out.println("Grrrrr");
    }
    void SetAge(int newAge) {
        age = newAge;
    }
    void PrintDescription() {
        System.out.println(name + " is a " + age + " year old, " +color+ " " + species);
    }
}
