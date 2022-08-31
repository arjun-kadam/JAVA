package com.company;

import java.util.Scanner;

public class SpecificException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int [] nums=new int[5];
        nums[0]=12;
        nums[1]=2;
        nums[2]=32;
        nums[3]=42;
        nums[4]=0;

        System.out.println("Enter index");
        int ind= sc.nextInt();

        try {
            System.out.println("Index Entered ==>"+nums[ind]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array is not reachable");
        }
        try {
            System.out.println("Division ==>"+nums[3]/nums[ind]);
        }
        catch (ArithmeticException a){
            System.out.println("Division is not possible");
        }
    }
}
