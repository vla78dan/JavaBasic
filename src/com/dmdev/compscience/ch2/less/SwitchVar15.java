package com.dmdev.compscience.ch2.less;

public class SwitchVar15 {
    public static void main(String[] args) {
        int month = 4;
        String result = switch (month) {

            case 12, 1, 2 -> "Зима";
            case 3, 4, 5 -> "Весна";
            case 7, 8, 6 -> "Лето";
            case 11, 10, 9 -> "Осень";
            default -> "Месяц введен неправильно";
        };
        System.out.println(result);
    }
}
