package com.hyperskill.example.ifelse;

import java.util.Scanner;

public class NumPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        if (q < 0 || q == 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
        sc.close();
    }
}
