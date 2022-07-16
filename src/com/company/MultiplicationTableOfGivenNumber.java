package com.company;
import java.util.Scanner;
public class MultiplicationTableOfGivenNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number,iterations=1;
        System.out.println("Enter Any Number");
        number=sc.nextInt();
        for (;iterations<=10;iterations++){
            System.out.println(number*iterations);
        }
    }
}
