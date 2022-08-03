package com.company;
class CylinderArea{
    private float radius;
    private float height;

    //Data Set To Variables
    void getData(float r,float h){
        radius=r;
        height=h;
    }
    // Volume Calculated
    float cylinderVolume(){
        return 3.142f*radius*radius*height;
    }
    float cylinderSurfaceArea(){
        return 2*3.142f*radius*height+2*3.142f*radius*radius;
    }
}
public class Cylinder {
    public static void main(String[] args) {
        CylinderArea c1=new CylinderArea();
        c1.getData(12,9);
        System.out.println("Volume "+c1.cylinderVolume());
        System.out.println("Surface Area "+c1.cylinderSurfaceArea());

    }
}
