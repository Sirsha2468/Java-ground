package com.sirsha;

import java.util.*;
public class Main {
//public class function
//{
    public static int CalculateSum(int a, int b) // Camel case (CalculateSum)
    {
        int Sum;
        Sum = a + b;
        return Sum;
    }
//}
//public class Main {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        int Sum = CalculateSum(a, b);
        System.out.println(Sum);
	}
}
