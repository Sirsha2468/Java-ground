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
        System.out.println("Enter your name: ");
        String name = sc.next();    // For printing one statement only ( EX : Sirsha )
        // String name = sc.nextLine(); // For printing more than one statement ( Ex : Sirsha Dey )
        PrintMyName(name); // Function call
    }
}
