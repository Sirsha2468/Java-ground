package com.sirsha;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of row: ");
        n = sc.nextInt();
        //Upper half
        for (int i = 1; i <= n; i++) {
            //1st part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            //Spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            //2nd part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //Lower half
        for (int i = n; i >=1; i--){

            //1st part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            //Spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            //2nd part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();


        }
    }
}
