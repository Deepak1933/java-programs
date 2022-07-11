/*

           Leap Year
           Any year is input by the user. Write a program to determine whether the year is a leap year or not.

           Leap Years are any year that can be evenly divided by 4.  A year that is evenly divisible by 100 is a leap year only if it is also evenly divisible by 400.

          */


       import java.util.Scanner;

        public class LeapYear
         {
              public static void main(String[] args)
                {
                   int year;
    
                     Scanner console = new Scanner(System.in);

                         System.out.print(" Enter Your Desired Year: ");
                         year=console.nextInt();
  
          if ((year % 4 == 0) && ((year % 400 == 0) || (year % 100 != 0)))
                       {
                            System.out.println("A leap year");
                  }
                 else
                         {
                                     System.out.println("Not a leap year");
                               }
                          }
                  }