package com.dmdev.compscience.ch2.less;

public class Year4 {

    //    [модификатор]_возвращаемое значение_название([параметры])
    public static void main(String[] args) {
        int year = 1900;
        isLeapYear(year);
    }

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
//            System.out.println(year + " is a leap year");
            return true;
        } else {
            return false;
//            System.out.println(year + " is not a leap year");
        }
    }
}
