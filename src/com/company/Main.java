package com.company;

import static com.company.Employee.*;

public class Main {

    public static void main(String[] args) {
        Employee employees[] = new Employee[]{
                new Employee("Andy F F", 1, 5000),
                new Employee("Jony B B", 2, 20000),
                new Employee("Abraham B B", 3, 26000),
                new Employee("Franklin B B", 4, 80000),
                new Employee("Bush B B", 5, 120000),
                new Employee("Abama B B", 1, 1000),
                new Employee("Baiden B B", 2, 30000),
                new Employee("Trump B B", 3, 220000),
                new Employee("Canady B B", 4, 960000),
                new Employee("Linkoln B B", 2, 270000)

        };

        fullListEmployees(employees);
        minSalary(employees);
        maxSalary(employees);
        System.out.println(sumSalary(employees));
        avgSalary(employees);
        fullListEmpNames(employees);
    }

}
