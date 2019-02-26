package com.company;
import java.util.Scanner;
public class Main {
//enter 2 digit numbers in between the right numbers(skip number 3 go through all 4 before typing 117)
    public static void main(String[] args) {
        int loop = 0;
        int firstNumber = 1;
        int secondNumber = 1;
        int thirdNumber = 1;
        int fourthNumber = 1;
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a Single Digit Number");
        while (loop == 0) {
            while (loop == 0) {
                try {
                    firstNumber = Integer.parseInt(console.nextLine());
                    if (firstNumber > 9) {
                        System.out.println("Not a Single Digit Number");
                        continue;
                    }
                    break;
                } catch (NumberFormatException ex) {
                    System.out.println("Not a Single Digit Number");
                    System.out.println("Enter a Single Digit Number");
                    continue;
                }
            }
            System.out.println("Enter a Single Digit Number");
            while (loop == 0) {
                try {
                    secondNumber = Integer.parseInt(console.nextLine());
                    if (secondNumber > 9) {
                        System.out.println("Not a Single Digit Number");
                        continue;
                    }
                    break;
                } catch (NumberFormatException ex) {
                    System.out.println("Not a Single Digit Number");
                    System.out.println("Enter a Single Digit Number");
                    continue;
                }
            }
            System.out.println("Enter a Single Digit Number");
            while (loop == 0) {
                try {
                    if (thirdNumber > 9) {
                        System.out.println("Not a Single Digit Number");
                        continue;
                    }
                    thirdNumber = Integer.parseInt(console.nextLine());
                    break;
                } catch (NumberFormatException ex) {
                    System.out.println("Not a Single Digit Number");
                    System.out.println("Enter a Single Digit Number");
                    continue;
                }
            }


            if (firstNumber == 1 && secondNumber == 1 && thirdNumber == 7) {
                System.out.println("Congratulations!");
            }
            System.out.println("Enter a Single Digit Number");
            while (loop == 0) {
                try {
                    fourthNumber = Integer.parseInt(console.nextLine());
                    if (fourthNumber > 9) {
                        System.out.println("Not a Single Digit Number");
                        continue;
                    }
                    break;
                } catch (NumberFormatException ex) {
                    System.out.println("Not a Single Digit Number");
                    System.out.println("Enter a Single Digit Number");
                    continue;
                }
            }
            if (firstNumber == 1 && secondNumber == 1 && thirdNumber == 7) {
                System.out.println("Congratulations!");
            }
            else if (secondNumber == 1 && thirdNumber == 1 && fourthNumber == 7) {
                System.out.println("Congratulations!");
            }
            else if (thirdNumber == 1 && fourthNumber == 1 && firstNumber == 7) {
                System.out.println("Congratulations!");
            }
            else if (fourthNumber == 1 && firstNumber == 1 && secondNumber == 7) {
                System.out.println("Congratulations!");
            }
            else System.out.println("Enter a Single Digit Number");
            continue;

        }





    }
}
