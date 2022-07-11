/*Even or Odd
Write a program that asks the user to enter a number and displays whether entered number is an odd number or even number.*/

import java.util.Scanner;

public class OddEven
{
    public static void main(String[] args)
    {
        int number;

        // Create a Scanner object to read input.
        Scanner console = new Scanner(System.in);

        // Get number from the user.
        System.out.print("Enter an integer: ");
        number = console.nextInt();

        // Determine even or odd.
        if (number % 2 == 0)
        {
            System.out.println("number is even");
        } 
        else
        {
            System.out.println("number is odd");
        }
    }
}