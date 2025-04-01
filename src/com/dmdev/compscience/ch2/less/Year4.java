package com.dmdev.compscience.ch2.less;

public class Year4 {

    //    [модификатор]_возвращаемое значение_название([параметры])
    public static void main(String[] args) {
        int year = 1900;
        isLeapYear(year);
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 ||(year % 4 == 0 && year % 100 != 0);

    }
}
