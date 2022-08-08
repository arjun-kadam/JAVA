package com.company;

class Base{
    Base(){
        System.out.println("This is Constructor of Class Base");
    }
}
class Derived extends Base{
    Derived(){
        System.out.println("This is Constructor of Class Derived");
    }
}

public class ConstructorsInInheritance {
    public static void main(String[] args) {
        Derived d1=new Derived();
        //If you create object of Derived Class From Extending Base Class Then Constructor in Base Class is execute First.
    }
}
