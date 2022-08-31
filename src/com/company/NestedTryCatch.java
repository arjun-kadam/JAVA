package com.company;

import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] a=new int[3];
        a[0]=222;
        a[1]=22;
        a[2]=0;
        System.out.println("Enter index");


        try {
            int ind =sc.nextInt();
            System.out.println("Index is ==>"+a[ind]);
            try {
                System.out.println("Division is "+a[0]/a[ind]);
            }
            catch (Exception e){
                System.out.println("Not Divisible");
            }
        }
        catch (Exception e){
            System.out.println("Not Success");
        }
    }
}
