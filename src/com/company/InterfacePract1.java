package com.company;

interface Bicycle{
    void applyBrake();
    void speedUp();
}
interface ElectricCycle{
    void chargingStatus();
}
class HeroBicycle implements Bicycle,ElectricCycle{
    public void applyBrake(){
        System.out.println("Brake Can Decrease the Cycle Speed");
    }

    public void speedUp() {
        System.out.println("You Can Increase Speed of Bicycle Using this function");
    }
    public void chargingStatus(){
        System.out.println("Charging Left only 25%");
    }
}
public class InterfacePract1 {
    public static void main(String[] args) {
        ElectricCycle avon=new HeroBicycle();// Created Object of HeroBicycle using ElectricCycle Reference
        HeroBicycle b1=new HeroBicycle();
        b1.applyBrake();
        b1.speedUp();
        //b1.chargingStatus();
        avon.chargingStatus();//now we can use methods of ElectricCycle Interface
    }
}
