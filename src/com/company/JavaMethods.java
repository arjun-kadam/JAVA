package com.company;

import java.util.Scanner;

public class JavaMethods {
    static void msg(){
        System.out.println("WelCome To Java Methods");
    }
    static int add(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        msg();
        int x,y;
        System.out.println("Enter A First No ");
        x=sc.nextInt();
        System.out.println("Enter A Second No ");
        y=sc.nextInt();
        int c=add(x,y);
        System.out.println("Addition is: "+c);

    }
}
