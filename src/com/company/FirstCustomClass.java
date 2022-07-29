package com.company;

class FirstClass{
    int a=10;
    int b=12;
    int c=a+b;
}
public class FirstCustomClass {
    public static void main(String[] args) {
        FirstClass obj=new FirstClass();
        System.out.println("Addition is "+obj.c);

    }
}
