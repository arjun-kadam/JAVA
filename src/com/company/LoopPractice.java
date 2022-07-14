package com.company;
//import java.util.Scanner;
public class LoopPractice {
    public static void main(String[] args) {
        int n=0;
        // While Loop
        System.out.println("While Loop");
        while(n<10){
            System.out.println(n);
            n++;
        }

        //Do-While Loop
        System.out.println("Do-While Loop");
        int m=0;
        do {
            System.out.println(m);
            m++;
        }while (m<5);

        //for loop
        System.out.println(" For Loop");
        for (int i=0;i<11;i++)
            System.out.println(i);
    }

}
