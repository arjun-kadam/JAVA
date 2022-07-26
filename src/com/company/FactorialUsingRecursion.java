package com.company;

public class FactorialUsingRecursion {
    static int factorial(int n){
        if(n==1 || n==0){
            return 1;
        }else {
            n*=factorial(n-1);
            return n;
        }
    }
    public static void main(String[] args) {
        long value=factorial(16);
        System.out.println("Factorial is "+value);
    }
}
