package com.company;

public class Combine implements Device, CanScan, CanPrint {

    void copy() {
        System.out.println("Идет копирование");
    }

    @Override
    public String getName() {
        return "Комбайн";
    }

    @Override
    public void print() {
        System.out.println("Идет лазерная печать");
    }
}
