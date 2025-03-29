package com.dmdev.compscience.ch2.less;

public class IfMonthConsole {
    public static void main(String[] args) {
        int month = 9;
/**
 * if (month == 12 || month == 1 || month == 2) {
 *             System.out.println("Winter");
 *         } else if (month == 3 || month == 4 || month == 5) {
 *             System.out.println("Spring");
 *         }else if (month == 6 || month == 7 || month == 8) {
 *             System.out.println("Summer");
 *         } else if (month == 9 || month == 10 || month == 11) {
 *             System.out.println("Autumn");
 *         } else {
 *             System.out.println("Wrong number: " + month);
 *         }
 */

        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Winter");
        } else if (3 <= month && month <= 5) {
            System.out.println("Spring");
        } else if (6 <= month && month <= 8) {
            System.out.println("Summer");
        } else if (9 <= month && month <= 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("Wrong number: " + month);
        }
    }
}
