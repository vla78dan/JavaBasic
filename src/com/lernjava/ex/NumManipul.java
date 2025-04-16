package com.lernjava.ex;

public class NumManipul {
    public static void main(String[] args) {
        int shields = 1000;
        double width = 2, height = 3;
        int cans = 300;
        int volume = 3;

        double paint = (cans * volume) / (shields * width * height);
        System.out.println(paint);
    }
}
