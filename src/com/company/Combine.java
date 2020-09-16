package com.company;

public class Combine implements Device {

    void LaserPrinting (){
        System.out.println("Идет лазерная печать");
    }
    void Scan () {
        System.out.println("Идет сканирование");
    }
    void Copy () {
        System.out.println("Идет копирование");
    }
}
