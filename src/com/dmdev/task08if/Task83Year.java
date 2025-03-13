package com.dmdev.task08if;

public class Task83Year {
// модификаторы, возвращаемый тип, название([параметры] массив)
    public static void main(String[] args) {
        int year = 1992;
        isLeapYear(year);
    }
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
//        if (resault) {
//            return true;
//        } else {
//            return false;
//        }
    }
}
