package com.hyperskill.ex.twenty.scanner;

import java.util.Scanner;

public class ScNameOrder {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");

        String name = sc.nextLine();

        System.out.print("Enter yourorder: ");
        String order = sc.nextLine();

        System.out.println("Thank you, " + name + "!");
        System.out.println("Your order: " + order);

        sc.close();
    }
    }

