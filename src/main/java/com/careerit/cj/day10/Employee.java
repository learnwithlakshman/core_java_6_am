package com.careerit.cj.day10;

public class Employee {

        private long id;
        private String name;
        private int age;
        private double salary;

        public Employee(long id, String name, int age, double salary) {
                this.id = id;
                this.name = name;
                this.age = age;
                this.salary = salary;
        }

        public long getId() {
                return id;
        }

        public String getName() {
                return name;
        }

        public int getAge() {
                return age;
        }

        public double getSalary() {
                return salary;
        }
}
