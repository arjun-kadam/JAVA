package com.company;

class Super{
    int a,b;
    Super(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void showData(){
        System.out.println(a+b);
    }
}
class Sub extends Super{
    Sub(int a,int b,int c){
        super(a,b);
        System.out.println(c);
    }
}
public class ThisAndSuper {
    public static void main(String[] args) {
        Sub obj =new Sub(22,5,7);
        obj.showData();
    }
}
