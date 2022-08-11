package com.company;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num,reverse=0,remainder;
        System.out.println("Enter Number :");
        num=sc.nextInt();
        int n=num; //This is For Future Use To Check Original and Reverse
        while (num>0){
            remainder=num%10;
            reverse=reverse*10+remainder;
            num=num/10;
        }
        if (n==reverse){
            System.out.println(n+" is a Palindrome Number");
        }else {
            System.out.println(n+" is NOT a Palindrome Number");
        }
    }
}
