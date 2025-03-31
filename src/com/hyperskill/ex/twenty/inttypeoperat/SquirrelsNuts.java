package com.hyperskill.ex.twenty.inttypeoperat;

/*
Белки и орехи
N белок нашли K орехов и решили разделить их поровну. Найдите, сколько орехов останется после того, как каждая из белок возьмет равное количество орехов.
Формат входных данных
Даны два положительных целых числа N и K, каждое из которых не больше 10000.
Пример ввода 1:
3
14
вывод
2
 */
public class SquirrelsNuts {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int squirrel = scanner.nextInt();
//        int nuts = scanner.nextInt();
//
//        System.out.println(nuts % squirrel);

        int a = 4, b = 6;
        int c = a + b;
        int result = c + (a + b) * c;
        System.out.println(result);
    }
}
