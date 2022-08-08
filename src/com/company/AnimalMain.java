package com.company;

class Animal{
    void print(){
        System.out.println("This Animal is Running");
    }
}
class Dog extends Animal{
    void intro(){
        System.out.println("Hello I am Dog From Animals in the World");
    }
    void sound(){
        System.out.println("Hey my sound is 'Bho Bho'");
    }

}
public class AnimalMain {
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.intro();
        d1.sound();
        d1.print();
    }
}
