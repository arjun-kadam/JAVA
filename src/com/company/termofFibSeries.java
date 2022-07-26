package com.company;

public class termofFibSeries {
    static int fib(int n){
        if(n==1||n==2){
            return n-1;
        }else {
            return fib(n-1)+fib(n-2);
        }
    }
    public static void main(String[] args) {
        int res=fib(4);
        System.out.println(res);
    }
}
