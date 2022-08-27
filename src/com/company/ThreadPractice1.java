package com.company;

class GM extends Thread{
    @Override
    public void run() {
        int i=0;

        while (i<100){
            try {
                Thread.sleep(200);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Good Morning");
            i++;
        }
    }
}
class WLC extends Thread{
    @Override
    public void run() {
        int j=0;
        while (j<100){
            System.out.println("Welcome");
            j++;
        }
    }
}

public class ThreadPractice1 {
    public static void main(String[] args) {
        GM g1=new GM();
        WLC w1=new WLC();
        g1.start();
        w1.start();

    }
}
