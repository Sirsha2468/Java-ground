package com.sirsha;

import java.util.* ;
public class Main {

    public static void main(String[] args) {

        int ch ;

        Scanner sc = new Scanner( System.in ) ;
        System.out.println( "Enter a month ( 1 for january ) & ( 2 for february ): " ) ;

        ch = sc.nextInt() ;

        switch( ch )
        {

            case 1:
                System.out.println( "January" ) ;
                break ;

            case 2:
                System.out.println( "February " ) ;
                break ;

            default: System.out.println( "Enter a option between ( 1 - 2 ): " ); ;

        }
    }
}
