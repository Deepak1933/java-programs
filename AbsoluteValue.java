/*
Absolute value
Write a program that asks the user to enter a number and displays the absolute value of that number.
*/


import java.util.Scanner;

public class AbsoluteValue
{
    public static void main(String[] args)
    {
        int number;

        // Create a Scanner object to read input.
        Scanner console = new Scanner(System.in);

        // Get number from the user.
        System.out.print("Enter an integer: ");
        number = console.nextInt();

        // Change sign if number is negative.
        if (number < 0)
        {
            number = -number;
        }

        // Display absolute value of number.        
        System.out.println("Absolute value: " + number);
    }
}