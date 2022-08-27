package com.company;

class ThreadMeth extends Thread{
    @Override
    public void run() {
        System.out.println("Thread Methods");
    }
}
public class ThreadMethods {
    public static void main(String[] args) {
        ThreadMeth m1 =new ThreadMeth();
        m1.setName("myThread");
        //m1.start();
        System.out.println(m1.getName());
        System.out.println(m1.isAlive());
        System.out.println(Thread.currentThread().getState());
    }
}
