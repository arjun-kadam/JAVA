package com.company;
import java.util.Scanner;
public class SumOfFirstEvenNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,sum=0,num=1,count=0;
        System.out.println("Enter Any Number");
        n=sc.nextInt();
        // This Logic Print Addition of even numbers given by user
        //Help Taken From "PencilProgrammer.com"
        while(count<n){
            if (num%2==0){
                sum+=num;
                count++;
            }
            num++;
        }
        System.out.println("sum is: "+sum);
    }


}
