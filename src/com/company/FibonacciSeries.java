package com.company;

public class FibonacciSeries {
    static void fibonacci(int a){
        int x,y=0,z=1;
        for (int i=1;i<=a;i++){
            System.out.print(" "+z+" ");
            x=y;
            y=z;
            z=x+y;

        }
    }
    public static void main(String[] args) {
        fibonacci(10);
    }
}
