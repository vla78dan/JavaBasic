package com.dmdev.compscience.ch3.less;

import java.util.Scanner;

public class Math32 {
    public static void main(String[] args) {
        /**
         * Написать программу, вычисляющую корни квадратного уравнения вида ax ² + bx + c = 0, где a, b и c - целочисленные параметры функции run.
         *
         * Вывести корни квадратного уравнения на консоль.
         * Если их два, то перечислить каждый с новой строки в консоли (просто использовать два раза System.out.println).
         * Если дискриминант отрицательный, вывести на консоль сообщение "нет корней".
         *
         * При решении создать и использовать следующие функции:
         *
         * - функция isPositive, определяющая, является ли число положительным
         *
         * - функция isZero, определяющая, является ли число нулём
         *
         * - функция discriminant, вычисляющая дискриминант
         *
         * Обращайте внимание, что параметры все целочисленные, а корни могут иметь дробную часть.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a: ");
        int a = scanner.nextInt();

        System.out.println("Input b: ");
        int b = scanner.nextInt();

        System.out.println("Input c: ");
        int c = scanner.nextInt();

        int discriminant = discriminant(a, b, c);
        if (isPositive(discriminant)) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
        } else if (isZero(discriminant)) {
            double x = -b / (2 * (double) a);
            System.out.println("x1: " + x);
        } else {
            System.out.println("Discriminant is negative");
        }
    }

    public static int discriminant(int a, int b, int c) {
        return b * b - 4 * a * c;

    }

    public static boolean isPositive(int value) {
        return value > 0;
    }

    public static boolean isZero(int value) {
        return value == 0;
    }
}

