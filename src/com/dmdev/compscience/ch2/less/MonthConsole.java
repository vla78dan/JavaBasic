package com.dmdev.compscience.ch2.less;

public class MonthConsole {
    public static void main(String[] args) {
        int month = 8;

        String result = switch (month) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> "No such month";
        };
        System.out.println(result);
    }
}
