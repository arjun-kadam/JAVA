package com.company;

class Parent{
    void showData(){
        System.out.println("Method From Parent Class");
    }
}
class Child extends Parent{
    @Override
    void showData(){
        System.out.println("Method From Child Class");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Child ch=new Child();
        ch.showData();
    }
}
