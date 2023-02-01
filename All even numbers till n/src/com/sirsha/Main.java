package com.sirsha;

import java.util.* ;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in ) ;
        int i, n ;
        System.out.println( "Print all even numbers till? " );
        n =sc.nextInt() ;
        for( i = 1 ; i <= n ; ++i )
        {
            if( i % 2 == 0 )

            System.out.println( i ) ;

        }

    }
}
