package com.careerit.cj.day10;

public class Student {

    int regno;
    String name;
    String email;
    String mobile;

    public Student(int regno, String name) {
        this(regno,name,"N/A");
    }
    public Student(int regno, String name,String email) {
        this(regno,name,email,"N/A");
    }
    public Student(int regno, String name, String email, String mobile) {
        this.regno = regno;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
    }

    public void showDetails() {
        System.out.println(regno+" "+name+" "+email+" "+mobile);
    }
    public static void main(String[] args) {
        Student s1 = new Student(1001,"Krish");
        Student s2 = new Student(1002,"Manoj","manoj@gmail.com");
        Student s3 = new Student(1009,"Charan","charan@gmail.com","9876543211");

        s1.showDetails();
        s2.showDetails();
        s3.showDetails();

    }

}
