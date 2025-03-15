package com.hyperskill.example.scanner;
/*
Точный квест прямоугольника
Создайте программу Java, которая вычисляет площадь прямоугольника. Предложите пользователю ввести длину и ширину прямоугольника с помощью Scanner. Вычислите площадь и отобразите результат, округленный до двух знаков после запятой. Входные значения — числа с плавающей точкой для длины и ширины. Выходные данные должны быть вычисленной площадью.
 */


import java.util.Scanner;

public class ScannerRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read length and width
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();

        // Calculate area
        double area = length * width;
        // Print result rounded to two decimal places
        System.out.println(area);

        scanner.close();
    }

}
