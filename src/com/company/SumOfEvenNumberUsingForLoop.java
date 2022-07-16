package com.company;
import java.util.Scanner;
public class SumOfEvenNumberUsingForLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,sum=0,count=0;
        System.out.println("Enter Any Number");
        n=sc.nextInt();
        // This Logic Print Addition of even numbers given by user
        for(int num=1;count<n;num++){
            if (num%2==0){
                sum+=num;
                count++;
            }

        }
        System.out.println("sum is: "+sum);
    }
}
