package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        Office office = new Office();
        Menu(office);
    }


    private static void Menu(Office office) throws IOException {
        System.out.println("Для выполнения операции введите:");
        System.out.println("    1. Добавить кабинет в офис");
        System.out.println("    2. Добавить устройство в кабинет");
        System.out.println("    3. Добавить сотруднка в кабинет");
        System.out.println("    4. Вывести все кабинеты с их устройствами");
        System.out.println("    5. Вывести всех сотрудников с указанием их кабинетов");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(reader.readLine());

        switch (input) {
            case 1:
                addCabinetToOffice(office);
                break;

            case 2:
                addDeviceToCabinet(office);
                break;

            case 3:
                addEmployeeToCabinet(office);
                break;

            case 4:
                office.printCabinetsAndDevices();
                Menu(office);
                break;

            case 5:
                office.printEmployeesAndCabinets();
                Menu(office);
                break;

        }

    }

    private static void addCabinetToOffice(Office office) throws IOException {
        System.out.println("Введите номер кабинета");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberCab = Integer.parseInt(reader.readLine());

        if (office.getCabinet(numberCab)==null) {
        office.addCabinet(new Cabinet(numberCab));
        }
        else {
            System.out.println("Кабинет с таким номером существует. Введите другой номер кабинета.");
            addCabinetToOffice(office);
        }
        Menu(office);

    }

    private static void addDeviceToCabinet(Office office) throws IOException {
        System.out.println("Введите номер кабинета");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberCab = Integer.parseInt(reader.readLine());
        Cabinet cabinet = office.getCabinet(numberCab);
        if (cabinet != null) {

            addDevice(cabinet);
            Menu(office);
        }
        else {
            System.out.println("Такого кабинета не существует. Введите другой № кабинета");
            addDeviceToCabinet(office);
        }
    }

    private static void addDevice(Cabinet cabinet) throws IOException {
        System.out.println("Введите цифру для добавления нужного устройства в кабинет");
        System.out.println("   1 - Принтер");
        System.out.println("   2 - Сканер");
        System.out.println("   3 - Комбайн");

        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        int NumberDevice = Integer.parseInt(reader2.readLine());
        switch (NumberDevice) {
            case 1:
                cabinet.addDevice(new Printer());
                break;

            case 2:
                cabinet.addDevice(new Scaner());
                break;
            case 3:
                cabinet.addDevice(new Combine());
                break;
            default:
                System.out.println("Вы ввели не верную цифру");
               addDevice(cabinet);
        }
    }

    private static void addEmployeeToCabinet (Office office) throws IOException {
        System.out.println("Введите номер кабинета");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberCab = Integer.parseInt(reader.readLine());
        Cabinet cabinet = office.getCabinet(numberCab);
        if (cabinet != null) {
            System.out.println("Введите ФИО сотрудника");
            BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
            String name = reader2.readLine();
            cabinet.addEmployee(new Employee(name));
            Menu(office);
        }
        else {
            System.out.println("Такого кабинета не существует. Введите другой № кабинета");
            addEmployeeToCabinet(office);
        }
    }
}