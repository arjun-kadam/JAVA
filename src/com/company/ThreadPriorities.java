package com.company;

class PrioritiesTest extends Thread{
    @Override
    public void run() {
        int i=1;
        while (i<100){
            System.out.println("Runner");
            i++;
        }
    }
}
class PrioritiesTest2 extends Thread{
    @Override
    public void run() {
        int j=1;
        while (j<100){
            System.out.println("Class 2 Runner");
            j++;
        }
    }
}
public class ThreadPriorities {
    public static void main(String[] args) {
        PrioritiesTest p1=new PrioritiesTest();
        PrioritiesTest2 p2=new PrioritiesTest2();

        p1.setPriority(9);
        p2.setPriority(5);
        //p4.setPriority(9);
        p1.start();
        p2.start();
        //System.out.println(p1.getPriority());
        //System.out.println(p2.getPriority());
    }
}
