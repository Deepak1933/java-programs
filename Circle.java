import java.util.Scanner;

public class Circle
{
    public static void main(String[] args)
    {
        int radius; // To hold circle's radius.
        double circumference; // To hold circle's circumference.
        double area; // To hold circle's area

        // Create a Scanner object to read input.
        Scanner console = new Scanner(System.in);

        // Get radius from the user.
        System.out.print("Enter radius ");
        radius = console.nextInt();

        // Calculate circumference.
        circumference = 2 * Math.PI * radius;

        // Calculate area.
        area = Math.PI * radius * radius;

        // Display circumference and area.
        System.out.println("The circumference of circle is "
                        + circumference);
        System.out.println("The area of circle is " + area);
    }
}