package com.company;
import java.util.Scanner;
public class MultiplicationTableInReverseOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number;
        System.out.println("Enter Any Number");
        number=sc.nextInt();
        for (int iterations=10;iterations>=1;iterations--){
            System.out.println(number*iterations);
        }
    }
}
