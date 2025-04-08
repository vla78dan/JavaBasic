package com.hyperskill.ex.fourty.repeat;

import java.util.Scanner;

public class SumEndingWithZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /**
         *

        int sum = 0;

        System.out.println("Введите числа (введите 0 для завершения):");

        while (true) {
            int number = scanner.nextInt();

            // Проверяем, если введено 0, выходим из цикла
            if (number == 0) {
                break;
            }

            // Проверяем, заканчивается ли число на 0
            if (number % 10 == 0) {
                sum += number; // Добавляем к сумме
            }
        }

        System.out.println("Сумма всех элементов последовательности, заканчивающихся на 0: " + sum);*/
        int value;
        int sum = 0;
        do {
            value = scanner.nextInt();

        } while (value != 0);
       sum = sum += value;
        System.out.println(sum);
    }
}
