/*

Grade Calculator
The marks obtained by a student in 3 different subjects are input by the user.
 Your program should calculate the average of subjects. The student gets a grade as per the following rules:

         Average	Grade

         90-100           A

         80-89            B

         70-79            C

         60-69            D

         0-59             F

*/


import java.util.Scanner;

        public class GradeCalc
          {
              public static void main ( String[] args )
                  {
                           int sub1 ,sub2 , sub3 ;
                           double average;
                           char Grade;
 
                           Scanner g = new Scanner( System.in);
   
                           System.out.print( " Enter The Number of sub1:");
                           sub1 = g.nextInt();

                           System.out.print( " Enter The Number of sub2:");
                           sub2 = g.nextInt();

                           System.out.print( " Enter The Number of sub3:");
                           sub3 = g.nextInt();

                           average = (sub1 + sub2 + sub3)/3.0;
 
                                   System.out.println("average is: " + average);

                   if (average<100 && average>90)
                      {
                             Grade = 'A';
                           }

                  else if (average<89 && average>=80)
                         {
                                Grade = 'B';
                            }

                  else if (average< 79 && average>=70)
                      {
                                Grade = 'C';
                           }

                   else if (average<69 && average>=60)
                               {
                                Grade = 'D';
                           }

                  else 
                          {
                                 Grade = 'F';
                        }

                  System.out.println("Grade is: " + Grade);

                 }
           }






