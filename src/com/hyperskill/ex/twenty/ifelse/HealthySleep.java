package com.hyperskill.ex.twenty.ifelse;

import java.util.Scanner;

public class HealthySleep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
/*

 */
        if (h < a) {
            System.out.println("Deficiency");
        } else if (h > b) {
            System.out.println("Excess");
            
        }else {
            System.out.println("Normal");
        }
        sc.close();
    }
}
