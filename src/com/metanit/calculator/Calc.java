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
            String a = scanner.next();
            System.out.print("Введите второе число: ");
            String b = scanner.next();
            System.out.println("Первое число = " + a);
            System.out.println("Второе число = " + b);

            int numA = getIntValue(a);
            int numB = getIntValue(b);

            int result;
            switch (action) {
                case (1) -> {
                    result = numA + numB;
                    System.out.println("Ответ = " + result);
                }
                case (2) -> {
                    result = numA - numB;
                    System.out.println("Ответ = " + result);
                }
                case (3) -> {
                    result = numA * numB;
                    System.out.println("Ответ = " + result);
                }
                case (4) -> {
                    if (numB == 0) {
                        System.out.println("На ноль делить нельзя");
                        break;
                    }
                    result = numA / numB;
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

    private static int getIntValue(String s) {
        try {
            return Integer.valueOf(s);
        } catch (NumberFormatException ex) {
            return switch (s) {
                case ("I") -> 1;
                case ("II") -> 2;
                case ("III") -> 3;
                case ("IV") -> 4;
                case ("V") -> 5;
                case ("VI") -> 6;
                case ("VII") -> 7;
                case ("VIII") -> 8;
                case ("IX") -> 9;
                case ("X") -> 10;
                default -> throw new IllegalStateException("Unexpected value: " + s);
            };
        } catch (Exception ex) {
            throw ex;
        }
    }
}


