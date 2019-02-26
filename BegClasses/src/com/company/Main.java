package com.company;

public class Main {

    public static void main(String[] args) {
        Animal donkey = new Animal();
        donkey.MakeSound();
        donkey.SetAge(2);
        donkey.AnimalInfo("donkey", "Greg", "green", 9);
        donkey.PrintDescription();
        donkey.SetAge(13);
        donkey.PrintDescription();
    }
}
