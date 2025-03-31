package com.hyperskill.ex.twenty.inttypeoperat;


import java.util.Scanner;

public class MinInHourMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minEnter = scanner.nextInt();

        int houre = minEnter / 60;
        int min = minEnter % 60;
        System.out.println(houre + " hours and " + min + " minutes");
    }
}
