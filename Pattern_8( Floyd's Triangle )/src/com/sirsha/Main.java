package com.sirsha;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
	int r, c, n;
    int number = 1; // Floyd's Triangle starts from 1
        System.out.println("Enter the number of row: ");
        n = sc.nextInt();

    for ( r = 1 ; r <= n ; ++r )
    {
        for (c = 1 ; c <= r ; c++ ){
            System.out.print(number + " "); // For printing space
            number++; // number = number + 1
        }
        System.out.println();
    }
    }
}
