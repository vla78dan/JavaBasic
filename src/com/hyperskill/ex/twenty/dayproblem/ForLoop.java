package com.hyperskill.ex.twenty.dayproblem;

/**
 * Создание программы для определения четных и нечетных чисел
 * <p>
 * Вам даны некоторые перемешанные строки кода из программы Java, которая предназначена для вывода четности или нечетности чисел от 0 до 10. Программа использует тернарный оператор для проверки четности числа и цикл for для перебора чисел. Ваша задача — переупорядочить предоставленные строки кода так, чтобы программа работала правильно. Обратите внимание, что вам может не понадобиться использовать все предоставленные строки. Ваше решение должно вывести «Число x четно» или «Число x нечетно», где x — каждое число от 0 до 10.
 */
public class ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String mess = (i % 2 == 0) ? "even" : "odd";
            System.out.println("Number " + i + " is " + mess);
        }
    }
}
