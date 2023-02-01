package com.sirsha;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, c, n;
        System.out.println("Enter the number of row: ");
        n = sc.nextInt();

                     /* Outer loop */

        for( r = n; r >= 1 ; r-- )
    {
        for( c = 1; c <= r; c++ )
        {
            System.out.print(c + " " ); // For printing space
        }
        System.out.println();
    }
    }
}
