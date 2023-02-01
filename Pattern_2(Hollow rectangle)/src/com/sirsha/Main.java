package com.sirsha;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;
        int n = 4, m = 5 ; //There are 4 column & 5 row
        int r, c ; // r = row & c = column

        for( r = 1 ; r <= n ; r++ )
        {
            for( c = 1 ; c <= m ; c++ )
            {
                if( r == 1 || c == 1 || r == n || c == m )
                {
                    System.out.print( "*" );
                }
                else
                    System.out.print(" ") ;
            }
            System.out.println();
        }
    }
}
