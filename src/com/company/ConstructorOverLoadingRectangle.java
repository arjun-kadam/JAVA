package com.company;

class RectangleLoading{
    int height,breadth;
    RectangleLoading(){
        height=12;
        breadth=10;
    }
    RectangleLoading(int h,int b){
        height=h;
        breadth=b;
    }
    int rectArea(){
        return height*breadth;
    }
}
public class ConstructorOverLoadingRectangle {
    public static void main(String[] args) {
        RectangleLoading r1=new RectangleLoading();
        RectangleLoading r2=new RectangleLoading(20,30);
        System.out.println("Default Area "+r1.rectArea());
        System.out.println("Parametrized Area "+r2.rectArea());
    }
}
