package com.hyperskill.example.inttypeoperat;


import java.util.Scanner;
/*
Увеличение, уменьшение и увеличение целого числа
Напишите программу на Java, которая считывает одно целое число из входных данных и увеличивает его на 1, затем уменьшает на 2 и, наконец, увеличивает на 3. Окончательное вычисленное целое число должно быть выведено в качестве выходных данных.
 */

public class IncDecInteger {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        int inputInteger = inputScanner.nextInt();

        inputInteger = (inputInteger++ - 2) + 3;

        System.out.println(inputInteger);
    }
}
