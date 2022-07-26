package com.company;

import java.util.Scanner;

public class MultiplicationTableUsingMethod {
    static void m_table(int n){
        for (int i=1;i<=10;i++){
            System.out.println(n*i);
        }
    }
    public static void main(String[] args) {

        int res;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        res= sc.nextInt();
        m_table(res);
    }
}
