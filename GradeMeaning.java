/*
 Meaning of Grade
 Write a program that prompts the user to enter grade. Your program should display the corresponding meaning of grade as per the following table

                  Grade      Meaning

                   A        Excellent

                   B          Good

                   C         Average

                   D        Deficient
                   
                   F          Failing
*/




              import java.util.Scanner;
              public class GradeMeaning
             {
                public static void main( String[] args)
                      {
                         char grade;

                           Scanner ch = new Scanner( System.in);
                           System.out.print(" Enter the Grade:");
                           grade = ch.next().charAt(0);

                            switch(grade)
                                   {

                                              case 'A': System.out.println("Excellent");
                                              break;
                                              case 'B': System.out.println("Good");
                                              break;
                                              case 'C': System.out.println("Average");
                                              break;
                                              case 'D': System.out.println("Deficient");
                                              break;
                                              case 'F': System.out.println("Failing");
                                              break;
                                              default:  System.out.println(" You enter the invalid Character");

                                     }
                            }
               }




 

