package com.hyperskill.ex.fourty.whileloop;

import java.util.Scanner;

public class WhileNum {
    public static void main(String[] args) {
        /*
        На вход программе подается последовательность неотрицательных целых чисел; каждое целое число записывается на отдельной строке. Последовательность заканчивается целым числом 0; когда программа считывает 0, она должна закончить свою работу и вывести длину последовательности (не считая последний 0).
        public class SequenceLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int number;

        while (true) {
            number = scanner.nextInt();
            if (number == 0) {
                break; // Завершаем цикл, если введено 0
            }
            count++; // Увеличиваем счетчик для каждого введенного числа
        }

        System.out.println(count); // Выводим длину последовательности
    }
}
Как работает программа:
Создается объект Scanner для считывания ввода с клавиатуры.
Инициализируется переменная count для подсчета количества введенных чисел.
В бесконечном цикле программа считывает целое число.
Если введенное число равно 0, цикл прерывается.
Если число не равно 0, увеличивается счетчик count.
После выхода из цикла программа выводит значение count, которое соответствует количеству введенных чисел.
         */
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int number;

        while (true) {
            number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}
