package com.company;

import java.util.ArrayList;
import java.util.List;

public class Office {

     private List<Cabinet> cabinets = new ArrayList<>();

    void addCabinet(Cabinet cabinet) {
        cabinets.add(cabinet);
    }

    public List<Cabinet> getCabinets() {
        return  cabinets;
    }

    Cabinet getCabinet(int numberCab) {
        for (Cabinet cabinet : cabinets) {
            if (cabinet.getNumber() == numberCab) {
                return cabinet;
            }
        }
        return null;
    }

    void printCabinetsAndDevices() {
        for (Cabinet cabinet : cabinets) {
            String cab = "Кабинет № " + cabinet.getNumber();
            if (cabinet.device != null) {
                cab = cab + " (" + cabinet.device.getName() + ")";
            }
            System.out.println(cab);
        }
    }

    void printEmployeesAndCabinets() {
        for (Cabinet cabinet : cabinets) {
            for (Employee employee : cabinet.getEmployees()) {
                System.out.println("Сотрудник " + employee.getName() + " работает в кабинете № " + cabinet.getNumber());
            }
        }

    }
}