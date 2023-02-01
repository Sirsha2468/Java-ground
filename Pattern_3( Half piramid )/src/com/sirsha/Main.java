package com.sirsha;

public class Main {

    public static void main(String[] args) {

        int r, c;
        for (r = 1; r <= 5; r++) {
            for (c = 1; c <= r; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}