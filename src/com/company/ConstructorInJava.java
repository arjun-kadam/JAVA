package com.company;

class ConstructorMain{
    int a,b;
    public ConstructorMain(int x,int y){
        a=x;
        b=y;
    }
    public int ConAddition(){
        return a+b;
    }
}
public class ConstructorInJava {
    public static void main(String[] args) {
        ConstructorMain Val=new ConstructorMain(10,20);
        System.out.println("Addition is "+Val.ConAddition());
    }
}
