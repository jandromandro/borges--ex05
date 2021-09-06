/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Marcos Borges
 */

package exercise05;

/*
Wrote a program that prompts for two numbers.
Print the sum, difference, product, and quotient
of those numbers.
 */

import java.util.Scanner;

public class Solution05 {

     private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("What is the first number? ");
        String firstNum = in.nextLine();
        System.out.println("What is the second number? ");
        String secondNum = in.nextLine();

        int num1 = Integer.parseInt(firstNum); // These two lines convert
        int num2 = Integer.parseInt(secondNum);// the strings to integers

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;

        System.out.println(String.format("%s + %s = %s\n%s - %s = %s \n%s * %s = %s \n%s / %s = %s \n",num1, num2, sum, num1, num2, difference, num1, num2, product, num1, num2, quotient));
    }
}
