package com.lernjava.ex;

import java.util.Scanner;

public class SumNumInLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int b = 0;

        /*System.out.println("Enter a number:");
        b = scanner.nextInt();
        sum = sum + b;


        System.out.println("Enter a number:");
        b = scanner.nextInt();
        sum = sum + b;

        System.out.println("Enter a number:");
        b = scanner.nextInt();
        sum = sum + b;
        System.out.println(sum);*/

        do{
            System.out.println("Enter a number:");
            b = scanner.nextInt();
            sum = sum + b;
        } while (b != 0);
        System.out.println(sum);
    }
}

