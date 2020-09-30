package com.company;

public class Printer implements Device {

    void inkjetPrinting() {
        System.out.println("Идет струйная печать");
    }

    @Override
    public String getName() {
        return "Принтер";
    }
}
