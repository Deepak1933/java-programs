import java.util.Scanner;

public class Triangle
{
    public static void main(String[] args)
    {
        double a, b, c; // To hold three sides

        // Create a Scanner object to read input.
        Scanner console = new Scanner(System.in);

        // Get sides from the user.
        System.out.print("Enter Side 1: ");
        a = console.nextInt();

        System.out.print("Enter Side 2: ");
        b = console.nextInt();

        System.out.print("Enter Side 3: ");
        c = console.nextInt();

        // Calculate area.
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        // Display area.
        System.out.println("The area of triangle is " + area);
    }
}