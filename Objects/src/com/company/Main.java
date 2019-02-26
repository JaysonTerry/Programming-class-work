package com.company;

import java.util.Random;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Random myRandom = new Random();
        Random anotherRandomGenerator = new Random();
        int RandomInt = myRandom.nextInt();
        System.out.println(RandomInt);
        double RandomDouble = anotherRandomGenerator.nextDouble();
        System.out.println(RandomDouble);

        ArrayList myList = new ArrayList();
        myList.add(12);
        int size = myList.size();
        System.out.println(size);

        myList.add(14);
        size = myList.size();
        System.out.println(size);

        Object numberGotten = myList.get(0);
        System.out.println(numberGotten);

        numberGotten = myList.get(1);
        System.out.println(numberGotten);

        myList.set(0, 5);
        numberGotten = myList.get(0);
        System.out.println(numberGotten);
        numberGotten = myList.get(1);
        System.out.println(numberGotten);
        myList.clear();
        Object clear = myList.size();
        System.out.println(clear);

        Date currentDate = new Date();
        Date anotherDate = new Date();
        String curDateString = currentDate.toString();
        anotherDate.setTime(123478);
        boolean dateCheck = currentDate.before(anotherDate);
        if (dateCheck = true) {
            System.out.println("current date is before another date");
        }
        if (dateCheck = false) {
            System.out.println("current date is after another date");
        }

    }
}
