package com.metanit.lesson7;

public class Season {

    public static void main(String[] args) {
        int month = 13;

        // int, short, byte, char, String

        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Осень");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Лето");
                break;
            default:
                System.out.println("Неверные данные");
        }
    }
}
