package com.lernjava.ex;

import java.util.Scanner;

public class Sum1ToN6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int N = scanner.nextInt();

        /*
        int sum = 0;
        int count = 1;
        do {
            sum += count;
            count++;
        } while (count <= N);


        int sum = 0;
        int count = 1;
        while (count <= N) {
            sum += count;
            count++;
        }
*/
        int sum = 0;
        for (int count = 1; count <= N; count++) {
            sum += count;
        }

        System.out.println(sum);
        scanner.close();
    }
}
