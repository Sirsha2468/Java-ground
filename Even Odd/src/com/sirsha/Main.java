package com.sirsha;
import java.util.* ;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in ) ;

        System.out.println( "Enter an integer: " ) ;
        int x = sc.nextInt() ;
        if( x % 2 == 0 )
        {
            System.out.println( "Even" ) ;
        }
        else
            System.out.println( "Odd" ) ;

    }
}
