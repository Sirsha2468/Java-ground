package com.sirsha;

import java.util.*;

public class Main {
    public static void PrintMyName(String name)
    {
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        PrintMyName(name); // Function call

    }
}
