import java.util.Scanner;

public class Seconds
{
    public static void main(String[] args)
    {
        int seconds; // To hold seconds.

        // Create a Scanner object to read input.
        Scanner console = new Scanner(System.in);

        // Get seconds from the user.
        System.out.print("Enter seconds ");
        seconds = console.nextInt();

        // Calculate hours in that seconds.
        int hours = seconds / 3600;

        // Calculate remaining minutes in that seconds.
        seconds = seconds % 3600;
        int minutes = seconds / 60;

        // Calculate remaining seconds in that seconds.
        seconds = seconds % 60;

        // Display result.
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
    }
}