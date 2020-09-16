package com.company;

public interface Device {
   default void TurnOn (){
       System.out.println("Включено");
    }
    default void TurnOff (){
        System.out.println("Выключено");
    }
}
