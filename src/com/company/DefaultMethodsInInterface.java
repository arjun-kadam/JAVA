package com.company;

interface PMO{
    void canTalk();
    void canWalk();
    default void haveSecurity(){
        System.out.println("PMO Have z+ Security");
    }
}
class citizen implements PMO{
    @Override
    public void canTalk() {
        System.out.println("We Are Citizens");
    }

    @Override
    public void canWalk() {
        System.out.println(" We go For Walk Everyday");
    }

    @Override
    public void haveSecurity() {
        System.out.println("We Don't Have Z+ Security");
    }
}
public class DefaultMethodsInInterface {
    public static void main(String[] args) {
        citizen ak=new citizen();
        ak.canTalk();
        ak.canWalk();
        ak.haveSecurity();
    }
}
