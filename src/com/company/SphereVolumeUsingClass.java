package com.company;

import java.util.Scanner;

class SphereCalculations{
    private float radius;
    //Getter For radius
    void getRad(float r){
        radius=r;
    }
    float sphereVolume(){
        return 1.33333f*3.142f*radius*radius*radius;
    }
    float sphereSurfaceArea()
    {
        return 4*3.142f*radius*radius;
    }
}
public class SphereVolumeUsingClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        SphereCalculations sh1=new SphereCalculations();
        System.out.println("Enter Radius ");
        float rad= sc.nextFloat();
        sh1.getRad(rad);
        System.out.println("Volume "+sh1.sphereVolume());
        System.out.println("Surface Area "+sh1.sphereSurfaceArea());
    }
}
