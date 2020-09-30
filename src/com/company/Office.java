package com.company;

import java.util.ArrayList;
import java.util.List;

public class Office {

    List<Cabinet> cabinets = new ArrayList<>();

    public void addCabinet(Cabinet cabinet) {
        cabinets.add(cabinet);
    }

    Cabinet getCabinet(int numberCab) {
        for (Cabinet cabinet : cabinets) {
            if (cabinet.number == numberCab) {
                return cabinet;
            }
        }
        return null;
    }

    void printCabinetsAndDevices() {
        for (Cabinet cabinet : cabinets) {
            String cab = "Кабинет № " + cabinet.number;
            if (cabinet.device != null) {
                cab = cab + " (" + cabinet.device.getName() + ")";
            }
            System.out.println(cab);
        }
    }

    void printEmployeesAndCabinets() {
        for (Cabinet cabinet : cabinets) {
            for (Employee employee : cabinet.employees) {
                System.out.println("Сотрудник " + employee.name + " работает в кабинете № " + cabinet.number);
            }
        }

    }
}