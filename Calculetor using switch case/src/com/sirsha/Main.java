package com.sirsha;

import java.util.* ;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b, ch;
        float total;
        do {
            System.out.println("\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder\n6.Exit\nEnter your choice: ");
            ch = sc.nextInt();

            switch ( ch ) {
                case 1:
                    System.out.println("Enter 2 number for addition: ");

                    a = sc.nextInt() ;
                    b = sc.nextInt() ;

                    total = a + b ;
                    System.out.println("The addition is: ") ;
                    System.out.println(total) ;
                    //total = sc.nextFloat() ;

                    break;

                case 2:
                    System.out.println("Enter 2 numbers for subtraction: ");

                    a = sc.nextInt();
                    b = sc.nextInt();

                    total = a - b;

                    System.out.println("Subtraction is: ");
                    System.out.println(total);
                    //total = sc.nextFloat();

                    break;

                case 3:
                    System.out.println("Enter 2 numbers for multiplication: ");

                    a = sc.nextInt();
                    b = sc.nextInt();

                    total = a * b;

                    System.out.println("Multiplication is: ");
                    System.out.println(total);
                   // total = sc.nextFloat();

                    break;

                case 4:
                    System.out.println( "Enter 2 number for division: " ) ;

                    a = sc.nextInt();
                    b = sc.nextInt();

                    //total = a / b ;

                    if (b == 0)

                        System.out.println( "Divisor can't be 0. Enter a value without 0: " ) ;
                        //System.out.println( b );

                    total = a / b;

                    System.out.println("Division is: ");
                    System.out.println( total );
                    //total = sc.nextFloat();

                    break;

                case 5:
                    System.out.println( "Enter 2 numbers for checking remainder: " ) ;

                    a = sc.nextInt() ;
                    b = sc.nextInt() ;

                    total = a % b ;

                    System.out.println( "Remainder is: " ) ;
                    System.out.println( total ) ;

                    break ;
                case 6:
              break;
                default: System.out.println( "Enter a correct choice ( 1 - 6 ) " ) ;


            }

        } while (ch != 6);

    }
}