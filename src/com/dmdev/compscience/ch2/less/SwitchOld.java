package com.dmdev.compscience.ch2.less;

public class SwitchOld {
    public static void main(String[] args) {
        int month = 4;
        switch (month) {
            case 11:
            case 10:
            case 9:
                System.out.println("Осень");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 7:
            case 8:
            case 6:
                System.out.println("Лето");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            default:
                System.out.println("Месяц введен неправильно");

        }
    }
}
