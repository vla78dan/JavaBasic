package com.hyperskill.example.inttypeoperat;


import java.util.Scanner;

public class IntTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        System.out.println((num / 10) % 10);
    }
}
