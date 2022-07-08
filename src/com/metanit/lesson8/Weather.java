package com.metanit.lesson8;

public class Weather {

    public static void main(String[] args) {
        int temperature = 33;
        if (temperature > 26) {
            System.out.println("Жарко");
        } else if (temperature < 10){
            System.out.println("Холодно");
        } else {
            System.out.println("Тепло");
        }
    }
}