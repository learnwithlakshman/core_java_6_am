package com.careerit.cj.day10;

import com.careerit.cj.day8.ListExampleWithNames;

import java.nio.file.Files;
import java.nio.file.Path;
import java.rmi.server.ExportException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    private List<Employee> employeeList;

    public EmployeeService() {
        employeeList = loadFromFile();
    }

    public List<Employee> getMaxPaidEmployees() {
        List<Employee> maxEmpList = new ArrayList<>();
        double maxSalary = getMaxSalary();
        for(Employee emp:employeeList){
            if(emp.getSalary() == maxSalary){
                maxEmpList.add(emp);
            }
        }
        return maxEmpList;
    }
    public List<Employee> getMinPaidEmployees() {
        return null;
    }
    public List<Employee> getEmployeesAgeBetween(int lb,int ub){
        return null;
    }
    public List<Employee> getEmployeesNameLike(String str){
        return null;
    }

    public double getTotalSalary() {
        int totalSalary = 0;
        for (Employee emp : employeeList) {
            totalSalary += emp.getSalary();
        }
        return totalSalary;
    }

    public float getAverageAge() {
        int sumOfAge = 0;
        for (Employee emp : employeeList) {
            sumOfAge += emp.getAge();
        }
        float avg = sumOfAge / (float) employeeList.size();
        return avg;
    }

    private List<Employee> loadFromFile() {
        List<Employee> empList = new ArrayList<>();
        try {
            List<String> list = Files.readAllLines(
                    Path.of(ListExampleWithNames.class.getResource("/emp_data.csv").toURI())
            );
            for (int i = 1; i < list.size(); i++) {
                String data = list.get(i);
                String[] arr = data.split(",");
                long id = Long.parseLong(arr[0]);
                String name = arr[1];
                int age = Integer.parseInt(arr[2]);
                float salary = Float.parseFloat(arr[3]);
                Employee emp = new Employee(id, name, age, salary);
                empList.add(emp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return empList;
    }

    private double getMaxSalary(){
        double max = employeeList.get(0).getSalary();
        for(int i=1;i<employeeList.size();i++){
            if(max < employeeList.get(i).getSalary()){
                    max = employeeList.get(i).getSalary();
            }
        }
        return max;
    }


}
