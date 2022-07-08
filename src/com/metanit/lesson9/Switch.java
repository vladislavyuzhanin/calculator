package com.metanit.lesson9;

public class Switch {

    public static void main(String[] args) {
        int wachingMode = 2;
        // Выкл
        // 1 - хлопок
        // 2 - синтетика
        // 3 - шелк
        // 4 - шерсть
        // ...
        switch (wachingMode) {
            case 0:
                System.out.println("Стиральная машина выключается...");
                break;
            case 1:
                System.out.println("Включается режим стирки хлопок");
                break;
            case 2:
                System.out.println("Включается режим стирки синтетика");
                break;
            case 3:
                System.out.println("Включается режим стирки шелк");
                break;
            case 4:
                System.out.println("Включается режим стирки шерсть");
                break;
            default:
                System.out.println("Выбран неверный режим");

        }
    }
}

