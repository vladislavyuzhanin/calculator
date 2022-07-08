package com.metanit.lesson6;

public class MainLesson6 {

    public static void main(String[] args) {
        boolean booleantrue = 10 > 5;
        boolean booleanfalse = 33 >= 50;
        System.out.println(booleantrue);
        System.out.println(booleanfalse);
        int numberOne = -15;
        int namberTwo = 15;
        if (numberOne > namberTwo) {
            System.out.println(numberOne + " больше " + namberTwo);
        } else if (numberOne < 20) {
            System.out.println(numberOne + " меньше " + namberTwo);
        } else {
            System.out.println(numberOne + " равно " + namberTwo);

        }

    }
}


