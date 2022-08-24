package com.company;

class MyTread1 extends Thread{
    public void run(){
        int n=0;
        while (n<100){
            System.out.println(n+"<**");
            n++;
        }
    }
}
class MyTread2 extends Thread{
    public void run(){
        int n=0;
        while (n<100){
            System.out.println(n+"<==");
            n++;
        }
    }
}

public class ThreadUsingClass {
    public static void main(String[] args) {
        MyTread1 m1=new MyTread1();
        MyTread2 m2=new MyTread2();
        m1.start();
        m2.start();
    }
}
