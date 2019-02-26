package com.company;

public class Main {

    public static void main(String[] args) {
        // animal class
        Animal penguin = new Animal();
        penguin.MakeSound();
        penguin.SetAnimalInfo("penguin", "Pengu");
        penguin.PrintName();

        //dog class
        Dog goodboy = new Dog();
        goodboy.MakeSound();
        goodboy.SetDoggoInfo("Good Boy", true);
        goodboy.PlayFetch();
        goodboy.PrintName();
        boolean dockedTail = goodboy.getDockedTail();
        System.out.println(dockedTail);

        //cat class
        Cat kitten = new Cat();
        kitten.MakeSound();
        kitten.SetCatInfo("Meowington");
        kitten.BeHappy();
        kitten.PrintName();
        kitten.SeeLaser();

        //orange tabby class
        OrangeTabby Tab = new OrangeTabby();
        Tab.SetCatInfo("Tab");
        Tab.MakeSound();
        Tab.PrintName();
        Tab.BeHappy();
        Tab.SeeLaser();
        Tab.LayOnLap();

        //russian blue class
        RussianBlue Blu = new RussianBlue();
        Blu.SetCatInfo("Blu");
        Blu.MakeSound();
        Blu.PrintName();
        Blu.BeHappy();
        Blu.SeeLaser();

        //garfield.

        Garfield Garfield = new Garfield();
        Garfield.SetCatInfo();
        Garfield.MakeSound();
        Garfield.PrintName();
        Garfield.BeHappy();
        Garfield.LayOnLap();
        Garfield.SeeLaser();
        Garfield.KickOdieOffTheTable();
    }
}
