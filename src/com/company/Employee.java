package com.company;

public class Employee {
    String fullNameEmployee;
    int department;
    float salary;
    private int id;
    static int counter = 1;

    public Employee(String fullNameEmployee, int department, float salary) {
        this.fullNameEmployee = fullNameEmployee;
        this.department = department;
        this.salary = salary;
        id = counter++;
    }

    public String getFullNameEmployee() {
        return fullNameEmployee;
    }

    public int getDepartment() {
        return department;
    }

    public float getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullNameEmployee='" + fullNameEmployee + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }

    public static void fullListEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    public static float sumSalary(Employee[] employees) {
        float sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].salary;
        }
        return sum;
    }

    public static void minSalary(Employee[] employees) {
        int bufMinId = 0;
        for (int i = 0; i < employees.length; i++) {

                if (employees[i].salary < employees[bufMinId].salary) bufMinId = i;

        }
        System.out.println(employees[bufMinId]);
    }
    public static void maxSalary(Employee[] employees) {
        int bufMaxId = 0;
        for (int i = 0; i < employees.length; i++) {

                if (employees[i].salary > employees[bufMaxId].salary) bufMaxId = i;

        }
        System.out.println(employees[bufMaxId]);
    }

    public static void avgSalary(Employee[] employees) {
        float avgSalary = sumSalary(employees)/employees.length;
        System.out.println(avgSalary);
    }

    public static void fullListEmpNames(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].fullNameEmployee);
        }
    }
}
