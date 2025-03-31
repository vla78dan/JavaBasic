package com.hyperskill.ex.twenty.ternary;

public class DoubleTern {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = false;

        int result = (b1 && b2) ? 10 : (b2 || b3) ? 20 : 30;
        System.out.println(result);
    }
}
/*
20
 */