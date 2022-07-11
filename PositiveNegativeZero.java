/*
Positive, negative or zero
Write a program that prompts the user to input a number. The program should then output the number and a message saying whether the number is positive, negative, or zero.
*/

import java.util.Scanner;

public class PositiveNegativeZero
{
    public static void main(String[] args)
    {
        int number; // To hold a number.

        // Create a Scanner object to read input.
        Scanner console = new Scanner(System.in);

        // Get number from the user.
        System.out.print("Enter an integer: ");
        number = console.nextInt();

        // Determine positive, negative or zero.
        if (number > 0)
        {
            System.out.println("Number is positive");
        }
        else if (number < 0)
        {
            System.out.println("Number is negative.");
        }
        else
        {
            System.out.println("Number is zero.");
        }
    }
}
