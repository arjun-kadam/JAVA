package com.company;
import java.util.Scanner;
public class FactorialOfGivenNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number, factorial=1;
        System.out.println("Enter Number To Calculate Factorial: ");
        number=sc.nextInt();
        for (;number>=1;number--){
            factorial*=number;
        }
        System.out.println("Factorial Of Given Number is ==> "+factorial);
    }
}
