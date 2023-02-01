package com.sirsha;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, c, n;
        System.out.print("Enter the number of row: ");
        n = sc.nextInt();

        for ( r = 1; r <= n; r++)
        {
            for ( c = 1; c <= r; c++ ){
                int sum = r + c ;
                if( sum % 2 == 0 ){ // Even
                    System.out.print("1/On  ");
                }
                else{ // Odd
                    System.out.print("0/Off ");
                }
            }
            System.out.println();
        }
    }
}
