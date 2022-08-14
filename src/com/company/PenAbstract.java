package com.company;

abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    @Override
    void write() {
        System.out.println("I will write smoothly");
    }

    @Override
    void refill() {
        System.out.println(" I need some refill");
    }
    void erase(){
        System.out.println("You are not able to erase my ink");
    }
}

public class PenAbstract {
    public static void main(String[] args) {
        FountainPen pen1=new FountainPen();
        //Pen p2=new FountainPen();
        //p2.write();
        pen1.write();
        pen1.refill();
        pen1.erase();
    }
}
