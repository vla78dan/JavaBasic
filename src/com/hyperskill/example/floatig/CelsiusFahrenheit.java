package com.hyperskill.example.floatig;

import java.util.Scanner;
/*
Напишите программу, которая считывает температуру в градусах Цельсия (°C) и показывает ее эквивалент в градусах Фаренгейта (°F).
Используйте следующую формулу:
F = C * 1.8 + 32
Объясните код
где C — температура в градусах Цельсия, а F — соответствующая температура в градусах Фаренгейта.
Пример ввода 1:
32.9
Объясните код
Пример вывода 1:
91.22
 */

public class CelsiusFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double celsius = scanner.nextDouble();
        double fahrenheit = celsius * 1.8 + 32;
        System.out.println(fahrenheit);
        scanner.close();
    }
}
