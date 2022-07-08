package com.metanit.lesson9;

public class Main {

    public static void main(String[] args) {
        int wachingMode = 1;
        // Выкл
        // 1 - хлопок
        // 2 - синтетика
        // 3 - шелк
        // 4 - шерсть
        // ...
        if (wachingMode == 0) {
            System.out.println("Стиральная машина выключается...");
        } else if (wachingMode == 1) {
            System.out.println("Включается режим стирки хлопок");
        } else if (wachingMode == 2) {
            System.out.println("Включается режим стирки синтетика");
        } else if (wachingMode == 3) {
            System.out.println("Включается режим стирки шелк");
        } else if (wachingMode == 4) {
        System.out.println("Включается режим стирки шерсть");
        } else {
            System.out.println("Выбран неверный режим");
        }
    }
}