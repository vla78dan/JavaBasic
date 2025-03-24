package com.hyperskill.example.bool;

import java.util.Scanner;

public class BoolSecEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean q = sc.nextBoolean();
        boolean w = sc.nextBoolean();
        if (q && w) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        sc.close();
    }
}
