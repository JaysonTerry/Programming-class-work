package com.company;

public class Main {

    public static void main(String[] args) {
        //Create the following functions.

        //Function Name: MyPrintFunction
        //Inputs: none
        //What it should do: Print the message: "In MyPrintFunction"
        //Returns: nothing

        //Function Name: BobPrinter
        //Inputs: none
        //What it should do: Print the message: "bob bob bob bob bob"
        //Returns: nothing

        //Function Name: Add
        //Inputs: 2 integers (num1 and num2)
        //What it should do: add num1 and num2
        //Returns: the integer that is result of adding num1 and num2 together

        //Function Name: Sub
        //Inputs: 2 integers (num1 and num2)
        //What it should do: subtract num2 from num1
        //Returns: the integer that is result of subtracting num2 from num1


        //Function Name: Add1
        //Inputs: 1 integer
        //What it should do: add 1 to the integer
        //Returns: the new integer
         

//In the main function call each of these functions for the function with inputs call them with 3 different inputs to show you tested the code.
//If the function returned a value you should print it to the screen
        MyPrintFunction();
        BobPrinter();
        Add(5, 2);
        Sub(10, -11);
        Add1(63);
        Mult(9, 2);}

    static void MyPrintFunction() {
        System.out.println("In MyPrintFunction");
    }
    static void BobPrinter()  {
        System.out.println("bob bob bob bob bob");
    }
    static int Add(int num1, int num2) {
        int result = num1 + num2;
        System.out.println(result);
        return result;
    }
    static int Sub(int num1, int num2) {
    int result = num1 - num2;
        System.out.println(result);
    return result;
    }
    static int Add1(int num1) {
    int result = num1 + 1;
        System.out.println(result);
    return result;
    }
    static int Mult(int num1, int num2) {
        int result = num1 * num2;
        System.out.println(result);
        return result;
    }
}
