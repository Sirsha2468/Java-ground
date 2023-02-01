package com.sirsha;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in ) ;
        int r, c ; // Declaring 2 variable r for row of pattern & c for column.

                    /* Outer loop */

        for( r = 1 ; r <= 4 ; r++ ) // For printing the row of pattern. The row will continue till the 4
        {
            for( c = 1 ; c <= 5 ; c++ ) // For printing the column of pattern. The column will continue till 5
            {
                System.out.print("*");
            }
            System.out.println(); //
        }

    }
}
