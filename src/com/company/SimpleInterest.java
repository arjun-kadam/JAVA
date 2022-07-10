package com.company;
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int amount,time;
        float rate;
        System.out.println("Enter amount borrowed from Bank ");
        amount=sc.nextInt();
        System.out.println("Enter Rate of Interest ");
        rate=sc.nextFloat();
        System.out.println("Enter Time(In Years) ");
        time=sc.nextInt();
        float final_interest=(amount*time*rate)/100;
        System.out.printf("Your Interest is ==> %.2f " ,final_interest);
    }
}

