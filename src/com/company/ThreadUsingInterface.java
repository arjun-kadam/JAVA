package com.company;

class ThreadDemo1 implements Runnable {
    @Override
    public void run() {
        int n = 0;
        while (n < 100) {
            System.out.println(n + "<==");
            n++;
        }
    }
}
class ThreadDemo2 implements Runnable {
    @Override
    public void run() {
        int n = 0;
        while (n < 100) {
            System.out.println(n + "<**");
            n++;
        }
    }
}
public class ThreadUsingInterface {
    public static void main(String[] args) {
        ThreadDemo1 t1=new ThreadDemo1();
        Thread tt1=new Thread(t1);

        ThreadDemo2 t2=new ThreadDemo2();
        Thread tt2= new Thread(t2);

        tt1.start();
        tt2.start();
    }
}
