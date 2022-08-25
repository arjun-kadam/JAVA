package com.company;

class MyThread11 extends Thread{
    MyThread11(String name){
        super(name);
    }
     public void run(){
         System.out.println("This is Thread ");
    }
}
public class ThreadConstructors {
    public static void main(String[] args) {
        MyThread11 m1 =new MyThread11("arjun");
        System.out.println(m1.getId());
        System.out.println(m1.getName());
    }
}
