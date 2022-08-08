package com.company;

class ClassA{
    int a,b;
    //int a=10,b=19;
    void getValue(int a,int b){
        this.a=a;
        this.b=b;
    }
}
class ClassB extends ClassA{
    void print(){
        System.out.println(a+b);
    }
}
public class InheritanceMain {
    public static void main(String[] args) {
        ClassB obj=new ClassB();
        obj.getValue(10,14);
        obj.print();
    }
}
