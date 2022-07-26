package com.company;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    static float CtoF(int c){
        float b;
        b=c*1.8f+32;
        return b;
    }
    public static void main(String[] args) {
        int c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Temperature In Celsius");
        c=sc.nextInt();
        float f=CtoF(c);
        System.out.println("Temperature is in Fahrenheit is "+f+"F");
    }
}
