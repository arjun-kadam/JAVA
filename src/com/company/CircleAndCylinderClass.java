package com.company;

import java.util.Scanner;

class Circle2{
    int radius;
    Circle2(int r){
        this.radius=r;
    }
    double Area1(){
        return Math.PI*radius*radius;
    }
    double Perimeter(){
        return 2*Math.PI*radius;
    }
}

class Cylinder2 extends Circle2{
    int height;

    Cylinder2(int r,int h) {
        super(r);
        this.height=h;
    }
    double Area(){
        return 2*Math.PI*radius*height+2*Math.PI*radius*radius;
    }
    double Volume(){
        return Math.PI*radius*radius*height;
    }
}
public class CircleAndCylinderClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" * * * * * Circle And Cylinder * * * * * ");
        System.out.println("Enter Radius and Height");
        System.out.println("Radius");
        int rad=sc.nextInt();
        System.out.println("Height");
        int ht= sc.nextInt();
        Cylinder2 object=new Cylinder2(rad,ht);
        System.out.println(" Area of Circle==> "+object.Area1());
        System.out.println(" Perimeter Of Circle==> "+object.Perimeter());
        System.out.println(" Area of Cylinder==> "+object.Area());
        System.out.println("Volume Of Cylinder==> "+object.Volume());



    }

}
