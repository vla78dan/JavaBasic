package com.hyperskill.ex.twenty.floatig;


import java.util.Scanner;

public class ExponentialExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double q = sc.nextDouble();
        double w = Math.pow(q, 3) + Math.pow(q, 2) + q + 1;
        System.out.println(w);
        sc.close();
    }
}
