package com.sirsha;

import java.util.* ;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in ) ;
	int i, n ;

        System.out.println( "Enter the number" );
        n = sc.nextInt() ;
        for( i = 0 ; i < n ; i ++ ) // for( initialisation ; condition ; flow ) || for(statement 1 ; statement 2 ; statement 3)
        {
//            System.out.println( ++i ) ; // odd up to n
//            System.out.println(i++) ; // Even up to n
            System.out.println(i) ; // 0 to n
        }

    }
}
