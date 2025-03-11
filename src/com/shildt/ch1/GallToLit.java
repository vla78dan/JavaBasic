package com.shildt.ch1;

/*
Программа для преобразования галлонов в литры.
*/
public class GallToLit {
    public static void main(String[] args) {
        double gallons;
        double liters;
        gallons = 1;
        liters = gallons * 3.7854;
        System.out.println(gallons + " галлонов соответствует " + liters + " литрам");
    }
}
