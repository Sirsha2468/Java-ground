package com.sirsha;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n - i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
