package com.company;

abstract class TelePhone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartPhone2 extends TelePhone{
    @Override
    void ring() {
        System.out.println("Phone is ringing...");
    }

    @Override
    void lift() {
        System.out.println("Get The Phone");
    }

    @Override
    void disconnect() {
        System.out.println("Please Disconnect Phone");
    }
    void gps(){
        System.out.println("I have GPS Technology");
    }
    void Cam(){
        System.out.println("I can Take Good Photos");
    }
}
public class CellularInheritance {
    public static void main(String[] args) {
        TelePhone t1=new SmartPhone2();
        System.out.println("Methods Of SmartPhone Class But Reference is TelePhone Class");
        t1.ring();
        t1.lift();
        t1.disconnect();
        SmartPhone2 vivo=new SmartPhone2();
        System.out.println("Methods Of SmartPhone Class Reference is SmartPhone Class");
        //vivo.ring();
        //vivo.lift();   // This Is Also Possible
        //vivo.disconnect();
        vivo.gps();
        vivo.Cam();

    }
}
