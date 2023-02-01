package com.sirsha;

public class Main {

    public static void main(String[] args) {
        int m = 5;
        // Outer loop
        for (int i = 1; i <= m; i++) {
            // Inner loop -> space print
            for (int j = 1; j <= m - i; j++) {
                System.out.print( " " );
            }

            //Inner loop  -> star print
            for (int j = 1; j <= i; j++) {
                System.out.print( "*" );
            }
            System.out.println();
        }
    }
}
