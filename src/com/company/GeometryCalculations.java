package com.company;

class Geometry{
    float pi =3.14f;

    float circleArea(int rad_in){
        return pi*rad_in*rad_in;
    }

    int squareArea(int side_in){
        return side_in*side_in;
    }

    int rectangleArea(int side1,int side2){
        return side1*side2;
    }
}

public class GeometryCalculations {
    public static void main(String[] args) {
        Geometry g1=new Geometry();
        System.out.println("Area Of Circle==> "+g1.circleArea(3));
        System.out.println("Area Of Square==> "+g1.squareArea(3));
        System.out.println("Area Of Rectangle==> "+g1.rectangleArea(12,13));

    }
}
