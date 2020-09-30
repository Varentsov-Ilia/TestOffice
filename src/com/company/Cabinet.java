package com.company;

import java.util.ArrayList;
import java.util.List;

public class Cabinet {

    final int number;

    List<Employee> employees = new ArrayList<>();

    Device device;

    public Cabinet(int number) {
        this.number = number;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void addDevice(Device device) {
        this.device = device;
    }


}
