package com.hyperskill.example.bool;

import java.util.Scanner;

public class ComparingValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int butterCups = sc.nextInt();
        boolean weekEnd = sc.nextBoolean();
        /*
        Сурки любят устраивать веселые вечеринки, и на своих вечеринках они любят есть арахисовые чашки Reese's. Но не слишком много, иначе им станет плохо! Успешная вечеринка сурка будет включать от 10 до 20 арахисовых чашек Reese's включительно, если только это не выходные, в этом случае им понадобится от 15 до 25 арахисовых чашек Reese's включительно.
Напишите программу на Java, которая считывает два значения:
первый — количество чашек арахисового масла Риза;
второе — логическое значение, указывающее, выходные ли это дни.
Программа должна вывести логическое значение, указывающее, была ли вечеринка успешной.
         */
        if (((butterCups >= 10) && (butterCups <= 20)) && !weekEnd ) {
            System.out.println(true);
        } else if ((butterCups >= 15) && (butterCups <= 25) && weekEnd) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        sc.close();
    }
}
