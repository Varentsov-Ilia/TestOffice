package com.company;

public interface Device {

    default void turnOn() {
        System.out.println("Включено");
    }

    default void turnOff() {
        System.out.println("Выключено");
    }

    String getName();
}
