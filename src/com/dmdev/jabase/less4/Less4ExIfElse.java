package com.dmdev.jabase.less4;

public class Less4ExIfElse {
    public static void main(String[] args) {
        int value = 0;
//        boolean test = value > 0;
        if (value > 0) {
            System.out.println("Число является положительным");
        }else if (value < 0) {
            System.out.println("Число является отрицательным");
        } else {
            System.out.println("Число равно нулю");
        }
    }
}
