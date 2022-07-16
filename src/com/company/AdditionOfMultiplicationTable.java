package com.company;
import java.util.Scanner;
public class AdditionOfMultiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number,iterations=1,sum=0,count=0;
        System.out.println("Enter Any Number");
        number=sc.nextInt();
            while(count<10){
                sum+=(number*iterations);
                iterations++;
                count++;
        }
        System.out.println("Sum is "+sum);
    }
}
