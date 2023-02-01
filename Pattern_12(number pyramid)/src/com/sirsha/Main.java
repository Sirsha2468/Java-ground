package com.sirsha;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, k, n;

        System.out.println("Enter the number of rows for making a number pyramid: ");
        n = sc.nextInt();

        for ( i = 1; i <= n; i++ ){
            //Spaces
            for ( j = 1; j <= n - i; j++ )
            {
                System.out.print(" ");
            }
            //numbers -> Print row no, row no times
            for ( j = 1; j <= i; j++)
            {
                System.out.println(i+" ");
            }
            System.out.println();
        }
    }
}
