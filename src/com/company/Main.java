package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Office office = new Office();
        office.addcabinet(new Cabinet( int x));

        private void printMenu () throws IOException {
            System.out.println("Для выполнения операции введите:");
            System.out.println("    1. Добавить кабинет");
            System.out.println("    2. Вывести список кабинетов");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int input = Integer.parseInt(reader.readLine());
            int Count = 0;
            switch (input) {
                case 1:
                    addcabinet
                case 2 //
                default //print
                    int i;// =Read user input
                    if (i == 1) {
                        //addcabinet
                    } else if (i == 2) {
                        //print cabinets
                        System.out.println("Кабинет №" + cabinet.number + "(" + cabinet.getDeviceName() + ")");
                    }
            }
        }
    }
}