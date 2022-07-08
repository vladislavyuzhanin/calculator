package com.metanit.calculator;

import java.util.Scanner;

class Calc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1.Сложение; 2.Вычитание; 3.Умножение; 4.Деление; 5.Выйти");
            System.out.print("Выберите действие: ");
            int action = scanner.nextInt();
            if (action == 5) {
                System.out.println("Программа завершена");
                return;
            }

            System.out.print("Введите первое число: ");
            int a = scanner.nextInt();
            System.out.print("Введите второе число: ");
            int b = scanner.nextInt();
            System.out.println("a = " + a);
            System.out.println("b = " + b);

            int result;
            switch (action) {
                case (1) -> {
                    result = a + b;
                    System.out.println("Ответ = " + result);
                }
                case (2) -> {
                    result = a - b;
                    System.out.println("Ответ = " + result);
                }
                case (3) -> {
                    result = a * b;
                    System.out.println("Ответ = " + result);
                }
                case (4) -> {
                    if (b == 0) {
                        System.out.println("На ноль делить нельзя");
                        break;
                    }
                    result = a / b;
                    System.out.println("Ответ = " + result);
                }
                default -> {
                    System.out.println("Ошибка/Error");
                    return;
                }
            }
            System.out.println();
        }
    }
}


