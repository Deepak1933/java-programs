/*
Largest Number
Write a program that asks the user to enter a numbers in three variables and then displays the largest number.
*/

import java.util.Scanner;

public class LargestNumber
{
    public static void main(String[] args)
    {
        int number1, number2, number3; // To hold three numbers.
        int largest; // To hold largest number.

        // Create a Scanner object to read input.
        Scanner console = new Scanner(System.in);

        // Get numbers from the user.
        System.out.print("Enter first number: ");
        number1 = console.nextInt();

        System.out.print("Enter second number: ");
        number2 = console.nextInt();

        System.out.print("Enter third number: ");
        number3 = console.nextInt();

        // Determine largest number.
        if (number1 > number2 && number1 > number3)
        {
            largest = number1;
        }
        else if (number2 > number3)
        {
            largest = number2;
        }
        else
        {
            largest = number3;
        }

        // Display largest number.
        System.out.println("Largest number: " + largest);
    }
}