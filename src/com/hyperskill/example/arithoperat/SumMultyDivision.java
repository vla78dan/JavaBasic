package com.hyperskill.example.arithoperat;

import java.util.Scanner;

/*
Сумма, умножение и деление двух целых чисел
Дано два целых числа, ваша задача — вычислить их сумму, результат умножения и результат деления первого целого числа на второе целое число (без знаков после запятой). Вы можете предположить, что второе целое число никогда не равно нулю. Сначала отсканируйте два целых числа из стандартного ввода. Затем выведите три результата в отдельных строках: сумму, результат умножения и результат деления.
 */

public class SumMultyDivision {
    public static void main(String[] args) {
//        Создаём сканнер для чтения объекта
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println(num1 + num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
    }
}
