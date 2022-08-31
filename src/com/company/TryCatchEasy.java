package com.company;

import java.util.Scanner;

public class TryCatchEasy {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a,b;
        System.out.println("Enter a Number:");
        a= sc.nextInt();
        System.out.println("Enter a 2nd Number ");
        b= sc.nextInt();
        try {
            System.out.println("Division is "+a/b);
        }
        catch (Exception e){
            System.out.println("Divided By Zero");
            System.out.println(e);
        }
    }
}
