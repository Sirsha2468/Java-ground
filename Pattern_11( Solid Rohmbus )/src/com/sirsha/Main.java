                                /*  Solid rhombus   */
package com.sirsha;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int r, spaces, c, n;
        System.out.println("Enter the number of row for making solid rhombus: ");
        n = sc.nextInt();

        for ( r = 1; r <= n; r++ )
        {

            //Spaces
            for ( spaces = 1 ; spaces <= n - r; spaces++ )
            {
                System.out.print(" ");
            }
            for ( c = 1; c <= 5; c++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
