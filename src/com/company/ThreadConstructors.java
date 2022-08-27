package com.company;

class MyThread11 extends Thread{
    MyThread11(String name){
        super(name);
    }
     public void run(){
         System.out.println("This is Thread ");
    }
}
class RunnableTest implements Runnable{
    @Override
    public void run() {
        System.out.println("This Will Run");
    }
}
public class ThreadConstructors {
    public static void main(String[] args) {
        MyThread11 m1 =new MyThread11("arjun");
        MyThread11 m2 =new MyThread11("AKK");
        RunnableTest r1=new RunnableTest();

        Thread t1=new Thread(r1,"Runner");



        System.out.println(m1.getId());
        System.out.println(m1.getName());
        System.out.println(m2.getId());
        System.out.println(m2.getName());
        System.out.println(t1.getId());
        System.out.println(t1.getName());
    }
}
