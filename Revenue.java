/*
Discount and Revenue
Revenue can be calculated as the selling price of the product times the quantity sold, i.e. revenue = price × quantity. 
Write a program that asks the user to enter product price and quantity and then calculate the revenue. 
If the revenue is more than 5000 a discount is 10% offered. Program should display the discount and net revenue.
*/



import java.util.Scanner;

public class Revenue
{
    public static void main(String[] args)
    {
        int revenue, price, quantity;
        int discount = 0; // To hold discount

        // Create a Scanner object to read input.
        Scanner console = new Scanner(System.in);

        // Get value from the user.
        System.out.print("Enter price of product: ");
        price = console.nextInt();

        System.out.print("Enter quantity of product: ");
        quantity = console.nextInt();

        // Calculate revenue.
        revenue = price * quantity;

        if (revenue > 5000)
        {
            // Calculate discount.
            discount = revenue * 10 / 100;
            // Calculate net revenue.
            revenue = revenue - discount;
        }

        // Display Discount and net revenue.
        System.out.println("The discount is " + discount);
        System.out.println("The net revenue is " + revenue);
    }
}