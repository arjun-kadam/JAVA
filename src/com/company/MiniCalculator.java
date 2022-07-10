package com.company;
import java.util.Scanner;
public class MiniCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice,num1,num2;
        System.out.println("Enter Choice : \n 1 ==> Addition \n 2 ==> Subtraction \n 3 ==> Multiplication \n 4 ==> Division");
        choice=sc.nextInt();
        if (choice<=4) {
            System.out.println("Enter First Number :");
            num1 = sc.nextInt();
            System.out.println("Enter Second Number :");
            num2 = sc.nextInt();
            switch (choice) {
                case 1 -> System.out.println("Addition is " + (num1 + num2));
                case 2 -> System.out.println("Subtraction is " + (num1 - num2));
                case 3 -> System.out.println("Multiplication is " + (num1 * num2));
                case 4 -> System.out.println("Division is " + (num1 / num2));
            }
        }else {
            System.out.println("Enter Valid Choice");
        }
    }
}