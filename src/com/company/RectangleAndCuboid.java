package com.company;

class Rectangle{
    int length,breadth;
    Rectangle(int l,int b){
        this.length=l;
        this.breadth=b;
    }
    int Area(){
        return length*breadth;
    }
}
class Cuboid extends Rectangle{
    int height;
    Cuboid(int l,int b,int h){
        super(l,b);
        this.height=h;
    }
    double s_Area(){
        return 2*(length*breadth+length*height+breadth*height);
    }
    double volume(){
        return length*breadth*height;
    }
}
public class RectangleAndCuboid {
    public static void main(String[] args) {
        System.out.println(" <===== Rectangle and Cuboid =====>");
        Cuboid obj=new Cuboid(10,20,30);
        System.out.println(" Area of Rectangle: "+obj.Area());
        System.out.println(" Surface Area of Cuboid: "+obj.s_Area());
        System.out.println(" Volume of Cuboid: "+obj.volume());

    }
}
