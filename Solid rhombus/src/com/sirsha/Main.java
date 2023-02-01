package com.sirsha;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of row: ");
        n = sc.nextInt();
        for ( int i = 1; i <= n; i++ )
        {

            //Spaces
            for ( int j = 1; j <= n - i; j++ )
            {
                System.out.print(" ");
            }
            for ( int k = 1; k <= 5; k++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
