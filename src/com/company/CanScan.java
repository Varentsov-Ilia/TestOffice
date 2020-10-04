package com.company;

public interface CanScan {

    default void scan() {
        System.out.println("Идет сканирование");
    }
}
