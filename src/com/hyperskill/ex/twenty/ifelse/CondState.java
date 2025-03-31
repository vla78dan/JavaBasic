package com.hyperskill.ex.twenty.ifelse;

import java.util.Scanner;

public class CondState {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        if (q == 5){
            System.out.println("MID");
        } else if (q < 5) {
            System.out.println("LOW");
        } else {
            System.out.println("HIGH");
        }
        sc.close();
    }
}
