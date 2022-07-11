/*
Valid Triangle
A triangle is valid if the sum of all the three angles is equal to 180 degrees. 
Write a program that asks the user to enter three integers as angles and check whether a triangle is valid or not.
*/

     import java.util.Scanner;
     public class ValidTriangle
         {
            public static void main(String[] args)
                 {

                     int a,b,c;

                     Scanner console = new Scanner(System.in);
                     System.out.print(" Enter The First angle:");
                     a=console.nextInt();

                     System.out.print(" Enter The Second angle:");
                     b=console.nextInt();

                    System.out.print(" Enter The Third angle:");
                    c=console.nextInt();

                             if(a+b+c==180)
                                   {
                                           System.out.println("This triangle is valid trinagle");
                                                  }
                             else
                                      {
                                            System.out.println("This triangle is not valid trinagle");
                                               }
                             }
               }
