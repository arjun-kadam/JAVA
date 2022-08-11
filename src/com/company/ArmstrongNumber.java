package com.company;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,arm=0,remainder;

        System.out.println("Enter Any Number: ");
        num=sc.nextInt();
        int n=num;
        while (num>0){
            remainder=num%10;
            arm=arm+(int)Math.pow(remainder,3);
            num=num/10;
        }
        if (n==arm){
            System.out.println(n+" is an Armstrong Number");
        }else {
            System.out.println(n+" is NOT an Armstrong Number");
        }
    }
}
