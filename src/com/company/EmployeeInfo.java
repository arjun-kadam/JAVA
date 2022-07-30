package com.company;

class Employee{
    int salary;
    String name;
    int getSalary(){
        return salary;
    }
    String getName(){
        return name;
    }
    void setName(String n){
        name=n;
    }
}

public class EmployeeInfo {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.salary=50000;
        e1.setName("Arjun");

        System.out.println("Name: "+e1.getName());
        System.out.println("Salary: "+e1.getSalary());

    }
}
