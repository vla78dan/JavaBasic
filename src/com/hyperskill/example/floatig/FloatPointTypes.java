package com.hyperskill.example.floatig;

import java.util.Scanner;

public class FloatPointTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double q = sc.nextDouble();
        double w = sc.nextDouble();
        double e = sc.nextDouble();
        double r = sc.nextDouble();
//        a * 10.5 + b * 4.4 + (c + d) / 2.2
        double t = q * 10.5 + w * 4.4 + (e + r) / 2.2;
        System.out.println(t);
        sc.close();

    }
}
