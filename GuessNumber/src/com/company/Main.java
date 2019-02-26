package com.company;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        String text = Input("You should be able to enter text");

        int value = IntInput("hello");
        System.out.println(value);

        PrintHint(2,    0);
        PrintHint(0,    2);
        PrintHint(0,    0);

        CheckGuess(2, 2);
        CheckGuess(0, 2);



        boolean loop = true;
        boolean matchChecker = false;
        int guessCounter = 0;
        Scanner console = new Scanner(System.in);
        String stringPrompt = "Enter Your Name:";
        //change this  for Input() so it can print out other prompts when needed
        String userName = Input("Enter Your Name:");
        while (loop == true) {
            System.out.println("Generating Number...");
            int GeneratedNumber = GenerateNumber();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Number Generated!");
            while (loop == true) {
                int GuessedNumber = IntInput("Enter a Number that is between 1-100");
                matchChecker = CheckGuess(GeneratedNumber, GuessedNumber);
                PrintHint(GeneratedNumber, GuessedNumber);
                if (matchChecker == true) {
                    System.out.println("You guessed the number in " + guessCounter + " tries, " + userName + "!");
                    //ask if the user wants to play again
                    System.out.println("Play Again? (Enter Yes/No)");
                    String playAgain = "filler";
                    while (true) {
                        playAgain = console.nextLine();
                        if (playAgain.equals("No")) {
                            loop = false;
                            break;
                        }
                        if (playAgain.equals("Yes")) {
                            break;
                        }
                        System.out.println("Enter Yes/No");
                    }

                    break;
                }
                guessCounter = guessCounter + 1;


            }

            guessCounter = 0;
        }
    }




    //allows user to enter name
    static String Input(String stringPrompt) {
        Scanner console = new Scanner(System.in);
        System.out.println(stringPrompt);
        String userInput = console.nextLine();
        return userInput;
    }
    //generates random number 1-100
    static int GenerateNumber() {
        Random rand = new Random();
        int n = rand.nextInt(100) + 1;
        return n;
    }
    //gets a number from 1-100 from user
    static int IntInput(String stringPrompt) {
        boolean loop = true;
        int userGuessedNumber = 0;
        while ( loop == true) {
            String intInput = Input(stringPrompt);
            try {
                userGuessedNumber = Integer.parseInt((intInput));
                if (userGuessedNumber < 0 || userGuessedNumber > 100) {
                    continue;
                }
            } catch (NumberFormatException ex) {
                continue;
            }
            break;
        }
        return userGuessedNumber;
    }


    // I accidentally combined this into one thing so oops i guess
    //static void GetGuess() {
    //IntInput(" Guess a Number that is between 1-100");
    //}

    //tells if guessed number is less or more than theSecretNumber
    static void PrintHint(int theSecretNumber, int userGuessedNumber) {
        if (userGuessedNumber < theSecretNumber) {
            System.out.println("The secret number is higher.");
        }
        else if (userGuessedNumber > theSecretNumber) {
            System.out.println("The secret number is lower");
        }
        return;
    }




    //Checks if guess = theSecretNumber
    static boolean CheckGuess(int theSecretNumber, int userGuessedNumber) {
        boolean match = false;
        if (userGuessedNumber != theSecretNumber) {
            PrintHint(theSecretNumber, userGuessedNumber);
            match = false;
        }
        if (userGuessedNumber == theSecretNumber) {
            match = true;
        }
        return match;
    }

}
