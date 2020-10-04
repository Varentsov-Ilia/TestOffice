package com.company;

public class Printer implements Device, CanPrint {

    @Override
    public String getName() {
        return "Принтер";
    }

    @Override
    public void print() {
        System.out.println("Идет струйная печать");
    }
}
