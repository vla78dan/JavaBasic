package com.dmdev.jabase.task10func;

/**
 * Написать функцию, которая принимает два целочисленных параметра, и возвращает наибольший
 */

public class taskFunk101 {
    public static void main(String[] args) {
        int value1 = 50;
        int value2 = 10;
        int result = getMax(value1, value2);
        System.out.println(result);
    }


    public static int getMax(int firstValue, int secondValue) {
        if (firstValue > secondValue) {
            return firstValue;
        } else {
            return secondValue;
        }
    }
}