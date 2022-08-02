package com.company;

class Cube{
    int length,breadth,height;
    Cube(){
        length=10;
        breadth=10;
        height=10;
    }
    Cube(int a,int b,int c){
        length=a;
        breadth=b;
        height=c;
    }
    int cubeArea(){
        return (length*breadth*height);
    }
}
public class ConstructorOverLoading {
    public static void main(String[] args) {
        Cube c1=new Cube();
        Cube c2=new Cube(10,20,30);
        System.out.println("Area Of Cube A ==>"+c1.cubeArea());
        System.out.println("Area of Cube B ==>"+c2.cubeArea());

        //We Can Initialize Class Object Like This
        /*      Cube c3,c4;
                c3=new Cube();
                c4=new Cube(1,2,3); */
    }
}
