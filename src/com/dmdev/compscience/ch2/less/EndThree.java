package com.dmdev.compscience.ch2.less;

public class EndThree {
    public static void main(String[] args) {
        int num = -63543543;
        int result = num % 10;
        boolean test = result == 3 || result == -3;
        if (test) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
