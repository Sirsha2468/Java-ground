package com.sirsha;
import java.util.* ;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in ) ;
        int i, n ;

        System.out.println( "Enter any integer for checking table of the integer:" );
        n = sc.nextInt() ;
        for( i = 1 ; i <= 10 ; i++ )
        {

            System.out.println( i * n ) ;

        }

    }
}
