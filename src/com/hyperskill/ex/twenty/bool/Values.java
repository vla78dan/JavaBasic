package com.hyperskill.ex.twenty.bool;

import java.util.Scanner;

public class Values {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        int w = sc.nextInt();

        if (q < w) {
            System.out.println("less than");
        } else if (q == w) {
            System.out.println("equal to");
        }else {
            System.out.println("greater than");
        }

        sc.close();
    }
}
