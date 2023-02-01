package com.sirsha;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        int input; // Taking a integer variable input
        do { // Starting do while loop

	Scanner sc = new Scanner( System.in ) ; // Scanner class
    int marks ; // Taking another integer variable marks

    System.out.println( "Enter your marks: " ); // Printing a statement
        marks = sc.nextInt() ; // Taking input from user in runtime || For storing marks

        if( marks >= 90 && marks <= 100 ) { // Condition
            System.out.println("This is good"); // Printing a statement
        }
        else if( marks >= 60 && marks <=89 ) // Else if condition
        {
            System.out.println( "\nThis is also good" ); // Printing another statement
        }
        else if( marks <= 59 && marks >= 0 ) // Condition
        {
            System.out.println( "This is good as well" ); // Printing another statement
        }
        else // Else
        {
            System.out.println( "Invalid" ); // Printing another statement
        }
            System.out.println( "Want to continue ? ( 1 = Yes & 2 = No )" ); // Printing another statement
            input = sc.nextInt(); // Taking user input in runtime

    } while( input == 1 ); // Stopping do while loop
    }
} // terminating public class main
