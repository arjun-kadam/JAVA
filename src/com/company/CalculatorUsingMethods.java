package com.company;
import java.util.Scanner;
public class CalculatorUsingMethods {
    static int sum(int x,int y){
        return x+y;
    }
    static int sub(int x,int y){
        return x-y;
    }
    static int mul(int x,int y){
        return x*y;
    }
    static int div(int x,int y){
        return x/y;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,mode;
        System.out.println("1.Add\n2.Sub\n3.Mul\n4.Div");
        mode=sc.nextInt();
        if(mode<=4){
            System.out.println("Enter First Number: ");
            a=sc.nextInt();
            System.out.println("Enter Second Number: ");
            b=sc.nextInt();
            if (mode==1){
                int q=sum(a,b);
                System.out.println("Addition "+q);
            }else if (mode==2){
                int q=sub(a,b);
                System.out.println("Addition "+q);
            }else if (mode==3){
                int q=mul(a,b);
                System.out.println("Addition "+q);
            }else if (mode==4){
                int q=div(a,b);
                System.out.println("Addition "+q);
            }
        }else {
            System.out.println("Enter Correct Choice");
        }


    }
}
