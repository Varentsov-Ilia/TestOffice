package com.company;

public class Scaner implements Device {

    void scan (){
        System.out.println("Идет сканирование");
    }

    @Override
    public String getName() {
        return "Сканер";
    }
}
