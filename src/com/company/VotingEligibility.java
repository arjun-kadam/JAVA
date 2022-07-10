package com.company;
import java.util.Scanner;
public class VotingEligibility {
    public static void main(String[] args) {
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Age :");
        age=sc.nextInt();
        if (age >=18) {
            System.out.println("You are Eligible For Voting !!!");
        }else {
            System.out.println("You are NOT Eligible for voting at this time ;)");
        }
    }
}
