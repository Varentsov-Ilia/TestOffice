package com.company;

public class Combine implements Device {

    void laserPrinting() {
        System.out.println("Идет лазерная печать");
    }

    void scan() {
        System.out.println("Идет сканирование");
    }

    void copy() {
        System.out.println("Идет копирование");
    }

    @Override
    public String getName() {
        return "Комбайн";
    }
}
