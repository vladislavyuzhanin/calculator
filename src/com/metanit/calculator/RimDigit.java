package com.metanit.calculator;

public enum RimDigit {
    ONE("I", 1),
    FIVE("V",5),
    TEN("X",10);

    private String name;
    private int value;

    RimDigit(String name, int value){
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
