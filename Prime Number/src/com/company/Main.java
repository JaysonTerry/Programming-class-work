package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int firstNumber = 0;
        int secondNumber = 0;
        int transfer = 0;
        int x = 2;
        int numberCheck;
        boolean isPrime = false;

        System.out.println("Enter a Number: ");
        //get numbers from user
        int loop = 0;
        while (loop == 0) {
            try {
                firstNumber = Integer.parseInt(console.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Not a whole number. Try Again.");
                continue;
            }
            break;
        }
        while (loop == 0) {
            System.out.println("Enter a second Number: ");
            try {
                secondNumber = Integer.parseInt(console.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Not a whole number. Try Again.");
                continue;
            }
            break;
        }

        //make the first number the smaller one if needed
            if (firstNumber > secondNumber) {
                transfer = firstNumber;
                firstNumber = secondNumber;
                secondNumber = transfer;
            }



            //To prove whether a number is a prime number, first try dividing it by 2, and see if you get a whole number. If you do, it can't be a prime number. If you don't get a whole number, next try dividing it by prime numbers: 3, 5, 7, 11 (9 is divisible by 3) and so on, always dividing by a prime number
            // use % to find remainders

        while (firstNumber < 1) {
            firstNumber = firstNumber + 1;
        }

        if (secondNumber > 1) {
            while (firstNumber <= secondNumber) {


                while (x < firstNumber) {


                    isPrime = true;
                    numberCheck = firstNumber % x;
                    if (numberCheck == 0) {
                        isPrime = false;
                        break;
                    }
                    x = x + 1;

                }
                if (isPrime == true || firstNumber == 2) {

                    System.out.println(firstNumber);
                }
                x = 2;

                firstNumber = firstNumber + 1;
            }



        }
    }
}







