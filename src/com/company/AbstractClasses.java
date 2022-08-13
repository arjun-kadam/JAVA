package com.company;

abstract class Phone1{
    int charge=1;
   abstract void switchOff();
   abstract void charging();
}
class SmartPhone1 extends Phone1{
    @Override
    void switchOff() {
        System.out.println("Phone is Turning Off.....");
    }

    @Override
    void charging() {
        System.out.println("Phone is Charging Now..");
    }
}
public class AbstractClasses {
    public static void main(String[] args) {
        SmartPhone1 vivo=new SmartPhone1();
        System.out.println("Your Phone Charging Is "+vivo.charge+"%");
        vivo.switchOff();
        System.out.println("Connecting To Charger");
        vivo.charging();

    }
}
