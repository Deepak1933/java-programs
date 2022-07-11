/*
progam reads two numbers from keyboard and determine the maximum number.
*/

import java.util.Scanner;
public class MaxNumber
          {
             public static void main( String[] args )
                     {
                           int a,b;
                           int max;

                            Scanner num = new Scanner( System.in);
                            System.out.print( " Enter the 1 number: ");
                            a = num.nextInt();
                            System.out.print( " Enter the 2 number: ");
                            b = num.nextInt();

                           if ( a>b)
                              {
                                       max = a ;
                               }
                        else
                               {
                                   max = b ;
                              }

                                       System.out.println( "Maximum Number Would be :" + max);


                             }
                         }


