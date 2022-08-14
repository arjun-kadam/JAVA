package com.company;

interface BasicAnimal{
    void eat();
    void sleep();
}
class Monkey /*implements BasicAnimal*/
{
    void jump(){
        System.out.println("I can Jump");
    }
    void bite(){
        System.out.println("I will bite you if you beat me");
    }
//
//    @Override
//    public void sleep() {
//        System.out.println("Possible");
//    }
//                                                   //Multiple Inheritance
//    @Override
//    public void eat() {
//        System.out.println("Possible");
//    }
}
class Human extends Monkey implements BasicAnimal{
    @Override
    public void eat() {
        System.out.println("I eat food for living");
    }

    @Override
    public void sleep() {
        System.out.println("I sleep for Good Health");
    }
    public void brain(){
        System.out.println("I have brain to think");
    }
}

public class AnimalsInheritance {
    public static void main(String[] args) {
        Human ak=new Human();
        //ak.bite();
        ak.eat();
        ak.sleep();
        ak.brain();
    }
}
