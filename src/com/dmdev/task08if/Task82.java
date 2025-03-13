package com.dmdev.task08if;

/**
 * 2. Дано целое число, определить является ли последняя цифра этого числа - цифрой 3.
 */

public class Task82 {
    public static void main(String[] args) {
        int value =9656888;
        if(value % 10 ==3){
            System.out.println("Последняя цифра равна 3");
        }
        else {
            System.out.println("Последняя цифра  не равна 3");
        }
    }
}
