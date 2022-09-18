package com.careerit.cj.day10;

import java.util.List;

public class EmployeeManager {

    public static void main(String[] args) {

        EmployeeService employeeService = new EmployeeService();
        double totalSalary = employeeService.getTotalSalary();
        float avgAge = employeeService.getAverageAge();
        List<Employee> maxPaidEmployees = employeeService.getMaxPaidEmployees();
        System.out.println("Total salary :" + totalSalary);
        System.out.println("Average age  :" + avgAge);
        System.out.println("Max paid employee");
        for (Employee emp : maxPaidEmployees) {
            System.out.println("Name :" + emp.getName() + "\nSalary :" + emp.getSalary());
        }
    }
}
