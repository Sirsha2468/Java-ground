package com.sirsha;

import java.util.* ;

public class Main {

    public static void main(String[] args) {

    Scanner sc = new Scanner( System.in ) ;
    double radius, area ;
    System.out.println( "Enter the radius : " ) ;

    radius = sc.nextFloat() ;

    area = 3.1415825 * ( radius * radius )   ;

    System.out.println( radius ) ;

    }
}
