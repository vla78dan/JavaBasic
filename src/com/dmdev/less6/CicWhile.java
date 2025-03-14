package com.dmdev.less6;

public class CicWhile {
    public static void main(String[] args) {
        int value = 0;
        do {
            System.out.println(value);
            value++;
        } while (value < 10);
    }

    private static void whileEx() {
        int value = 10;
        while (value > 0) {
            System.out.println(value);
            value--;
        }
    }
}
