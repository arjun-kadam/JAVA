package com.company;
import java.util.Scanner;
public class MathFunctions {
    public static void main(String[] args) {
        //Minimum & Maximun Value
        int num1,num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number ");
        num1=sc.nextInt();
        System.out.println("Enter Second Number ");
        num2=sc.nextInt();
        System.out.println("Minimum Is "+Math.min(num1,num2));
        System.out.println("Maximum Is "+Math.max(num1,num2));

        //SquareRoot
        int val;
        System.out.println("Enter Value To Calculate SquareRoot");
        val=sc.nextInt();
        float sqrot= (float) Math.sqrt(val);
        System.out.println("SquareRoot Of "+val+" Is "+sqrot);

        //Power of number
        int base,power;
        System.out.println("Enter Base Value");
        base=sc.nextInt();
        System.out.println("Enter Power ");
        power=sc.nextInt();
        double res_pow = Math.pow(base,power);
        System.out.println("Value of "+base+" Base to the Power "+power+" is "+res_pow);



    }
}
