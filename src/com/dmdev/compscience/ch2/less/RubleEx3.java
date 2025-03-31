package com.dmdev.compscience.ch2.less;

public class RubleEx3 {
    public static void main(String[] args) {
int rubles = 458;
// 1, !11 рубль
        /*
        2 3 4 рубля
        0 5 - 9. 11 - 19 рублей
         */
        int remainder10 = rubles % 10;
        int reminder100 = rubles % 100;

        if (remainder10 == 0 || (5 <= remainder10 && remainder10 <= 9) || (11 <= remainder10 && remainder10 <= 19)) {
            System.out.println(rubles + " рублей");
        } else if (2 <= remainder10 && remainder10 <= 4) {
            System.out.println(rubles + " рубля");
        } else if (remainder10 == 1) {
            System.out.println(rubles + " рубль");
        }
        else {
            System.out.println("Некорректное условие");
        }
    }
}
