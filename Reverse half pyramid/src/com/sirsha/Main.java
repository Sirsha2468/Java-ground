                                                /*  Reverse half pyramid    */
package com.sirsha;

public class Main {

    public static void main(String[] args) {
        int r, c, m = 5;
        for (r = m; r >= 1; r--) {
            for (c = 1; c <= r; c++) {
                System.out.print("*");
            }

            System.out.println();

        }
    }
}
