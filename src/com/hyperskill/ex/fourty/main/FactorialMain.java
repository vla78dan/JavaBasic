package com.hyperskill.ex.fourty.main;

import java.util.Scanner;

public class FactorialMain {
    // 3.6 Always use 'Main' as class name

    // 3.0 No method main code here, user write their own
//    Всегда используйте «Main» в качестве имени класса
//Здесь нет кода метода main, пользователь пишет свой собственный
    public static void main(String[] args) {

        // 3.2 Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // TODO: 1. Ask user for an integer 'n' using scanner.nextInt()
        System.out.println("Enter a number: ");

        int n = scanner.nextInt();

        // TODO: 2. Print the factorial of 'n'


        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println(result);



        scanner.close(); // Always close the scanner when done

    }
}
/*
Создайте программу Java, которая запрашивает у пользователя целое число 'n' и выводит факториал 'n'. Ваша программа должна состоять из основного метода, в котором находится вся ваша логика. Предположим, что входное целое число 'n' неотрицательно. Основной метод должен считывать данные со стандартного ввода и выводить их на стандартный вывод. Например, если входное значение равно 5, выходное значение должно быть 120, поскольку 1*2*3*4*5 = 120.
 */