package com.company;

import java.util.Scanner;

public class TryCatchExercise {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int [] arr=new int[3];
        arr[0]=2;
        arr[1]=24;
        arr[2]=23;

        System.out.println("Enter Index");
        boolean flag=true;
        while (flag){
            try {
                int ind =sc.nextInt();
                System.out.println("Index value is "+arr[ind]);
                flag=false;
            }
            catch (Exception e){
                System.out.println("Array Index is Not Reachable");
            }
        }
        System.out.println("Out of While");
    }
}
