package com.company;

import java.util.ArrayList;
import java.util.List;

public class Cabinet {

    private final int number;

    private List<Employee> employees = new ArrayList<>();

    Device device;

    public Cabinet(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public List<Employee> getEmployees() {
        return  employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void addDevice(Device device) {
        this.device = device;
    }


}
