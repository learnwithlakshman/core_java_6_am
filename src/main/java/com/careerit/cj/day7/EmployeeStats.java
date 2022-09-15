package com.careerit.cj.day7;

import java.util.Arrays;


public class EmployeeStats {

    public static void main(String[] args) {
        float[] arr = getSalaryList();
        System.out.println(Arrays.toString(arr));
        // Max, Min value
        float min = arr[0];
        float max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Min :" + min + " and Max :" + max);

        Employee[] empArr = getEmployees();
        double maxSalary = empArr[0].getSalary();
        double minSalary = empArr[0].getSalary();
        double totalSalary = 0;
        for (Employee emp : empArr) {
            System.out.println(emp.getEmpno() + "," + emp.getName() + "," + emp.getSalary());
            totalSalary += emp.getSalary();
            if(maxSalary < emp.getSalary()){
                maxSalary = emp.getSalary();
            }
            if(minSalary > emp.getSalary()){
                minSalary = emp.getSalary();
            }
        }
        System.out.println("Total count   :"+empArr.length);
        System.out.println("Max Salary    :"+maxSalary);
        System.out.println("Min Salary    :"+minSalary);
        System.out.println("Total salary  :"+totalSalary);
        System.out.println("Average salary :"+(totalSalary/empArr.length));
    }


    private static float[] getSalaryList() {
        return new float[]{9, 12, 13, 15, 20, 23, 12, 24, 17, 18};
    }

    private static Employee[] getEmployees() {
        Employee[] arr = new Employee[]{
                new Employee("E1001", "Krish", 45000),
                new Employee("E1002", "Manoj", 95000),
                new Employee("E1008", "Aadya", 85000),
                new Employee("E1010", "Dhatri", 45000),
                new Employee("E1012", "Tanvi", 145000)
        };
        return arr;
    }
}
