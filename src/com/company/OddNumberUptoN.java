package com.company;
import java.util.Scanner;
public class OddNumberUptoN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter Number to Print Odd Numbers ");
        n=sc.nextInt();
        //This Logic Will Print Odd Numbers Between 1 and User Input Value
        for (int num=1;num<=n;num++){
            System.out.println(num*2-1);
            n--;
        }
    }


}
