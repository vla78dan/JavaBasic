package com.hyperskill.ex.fourty.forloop;

import java.util.Scanner;

public class Duplicat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считываем строку из стандартного ввода

        String input = scanner.nextLine();

        // Создаем StringBuilder для формирования новой строки
        StringBuilder result = new StringBuilder();

        // Проходим по каждому символу входной строки
        for (char c : input.toCharArray()) {
            // Дублируем символ и добавляем в результат
            result.append(c).append(c);
        }

        // Выводим результат
        System.out.println(result.toString());

        // Закрываем сканер
        scanner.close();
    }
}
