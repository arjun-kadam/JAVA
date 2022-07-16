package com.company;
import java.util.Scanner;
public class FactorialUsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number, factorial=1;
        System.out.println("Enter Number To Calculate Factorial: ");
        number=sc.nextInt();
        while (number>=1){
            factorial*=number;
            number--;
        }
        System.out.println("Factorial Of Given Number is ==> "+factorial);
    }
}
