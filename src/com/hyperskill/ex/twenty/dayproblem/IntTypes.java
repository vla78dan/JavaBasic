package com.hyperskill.ex.twenty.dayproblem;

public class IntTypes {
    public static void main(String[] args) {
        int number = 12241;
        int digit = ((number % 100) / 10) % 10;
        System.out.println("digit: " + digit);
    }
}
