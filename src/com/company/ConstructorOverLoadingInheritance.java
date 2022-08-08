package com.company;

class OverLoad1{
    OverLoad1(){
        System.out.println("I am Default Constructor Of Parent Class");
    }
    OverLoad1(int x){
        System.out.println("x From Parent Class: "+x);
    }
}
class OverLoad2 extends OverLoad1{
    OverLoad2(){
        System.out.println("I am Default Constructor Of Child Class");
    }
    OverLoad2(int x,int y){
        super(x);
        System.out.println("y From Child Class: "+y);
    }
}
class OverLoad3 extends OverLoad2{
    OverLoad3(){
        System.out.println("I am Default Constructor Of Grand Child Class");
    }
    OverLoad3(int x,int y,int z){
        super(x,y);
        System.out.println("z From Grand Child Class: "+z);
    }
}
public class ConstructorOverLoadingInheritance {
    public static void main(String[] args) {
        OverLoad3 obj=new OverLoad3(12,13,14);
    }
}
