package com.hyperskill.example.dayproblem;

public class DeJaVu {
    public static void main(String[] args) {
        System.out.println("result is " + 5 + 7);
    }
}

/*
 * В Java использование оператора + со строками объединяет (или склеивает) все, что следует за ним.
 * Вот почему он преобразует число 5 в «5» (текстовую версию самого себя) и приклеивает его к «результату».
 * Все дело в контексте — как только вы начинаете со строки, Java рассматривает последующие элементы как часть этой строки.
 */