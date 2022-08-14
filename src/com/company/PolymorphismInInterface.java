package com.company;

interface Interface1{
    void meth1();
}
interface Interface2 extends Interface1{
    void meth2();
}
class InterfaceImplements implements Interface1,Interface2{
    @Override
    public void meth1() {
        System.out.println("Interface 1 Methods ");
    }

    @Override
    public void meth2() {
        System.out.println("Interface 2 Methods ");
    }
}

public class PolymorphismInInterface {
    public static void main(String[] args) {
        InterfaceImplements obj=new InterfaceImplements();
        obj.meth1();
        obj.meth2();
    }
}
