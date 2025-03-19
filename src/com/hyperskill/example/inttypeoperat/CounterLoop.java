package com.hyperskill.example.inttypeoperat;

/*
Восходящие мечты, нисходящие планы
Можете ли вы завершить код, чтобы создать два цикла, которые считают от 1 до 5? Первый цикл должен выводить числа в порядке возрастания, а второй цикл выводит их в порядке убывания.
 */

public class CounterLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }

    }
}
