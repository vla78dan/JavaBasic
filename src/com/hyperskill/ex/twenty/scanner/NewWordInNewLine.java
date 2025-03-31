package com.hyperskill.ex.twenty.scanner;
import java.util.Scanner;


public class NewWordInNewLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // start coding here
        String q = sc.next();
        String w = sc.next();
        String e = sc.next();
        String r = sc.next();
        String t = sc.next();

        System.out.println(q);
        System.out.println(w);
        System.out.println(e);
        System.out.println(r);
        System.out.println(t);
        sc.close();
    }
}

/*
Печать каждого слова с новой строки
Напишите программу, которая считывает пять слов из стандартного ввода и выводит каждое слово в новой строке. Слова должны быть в том же порядке.

Совет: вспомните разницу между next()и nextLine().

Пример ввода 1:

This Java platform
is adaptive

Объясните код
Пример вывода 1:

This
Java
platform
is
adaptive
 */