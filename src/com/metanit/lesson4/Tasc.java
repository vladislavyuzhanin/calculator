package com.metanit.lesson4;

public class Tasc {

    public static void main(String[] args) {
        byte ton = 1;
        short kilogram = (short) (ton * 1000);
        int gram = kilogram * 1000;
        int milligram = gram * 1000;
        System.out.println("В одной тонне" + kilogram + "килограмм," + gram + "грамм и" +
                milligram + "миллиграмм.");
        byte year = 1;
        byte months = (byte) (year * 12);
        short days = (short) (year * 365);
        int hours = year * 365;
        long minutes = hours * 60;
        long seconds = minutes * 60;
        long milliseconds = seconds * 1000L;
        System.out.println("В одноm году" + months + "месяцев," + days  + "дней," +
                hours + "часов," + minutes + "минут," + seconds + "секунд и" + milliseconds + "миллисекунд.");
    }
}

