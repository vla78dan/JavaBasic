package com.dmdev.compscience.ch3.less;

public class Func18 {
    public static void main(String[] args) {
        int first = 90;
        int second = 50;
        int result = getMax(first, second);
        System.out.println("Max result: " + result);
        int result2 = Math.max(first, second);
        System.out.println("Max2 result: " + result2);
    }

    public static int getMax(int value1, int value2) {
//        if (value1 > value2) {
//            return value1;
//        } else {
//            return value2;
//        }
        return value1 > value2 ? value1 : value2;
    }
}
