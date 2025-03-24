package com.hyperskill.example.bool;

import java.util.Scanner;

public class LessTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        if (q < 10) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        sc.close();
    }
}
