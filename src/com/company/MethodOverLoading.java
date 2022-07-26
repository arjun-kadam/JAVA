package com.company;
public class MethodOverLoading {
    static void sum(int a){
        int b = a+10;
        System.out.println(b);
    }
    static void sum(int a, int b){
        int c=a+b;
        System.out.println("Sum is "+c);
    }
    static void sum(int a,int b,int c){
        int d= a+b+c;
        System.out.println("Sum Of Three Numbers is "+d);
    }
    public static void main(String[] args) {
        sum(10);
        sum(28,19);
        sum(10,12,14);
    }
}
