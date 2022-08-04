package com.company;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rd=new Random();
        int cInput,uInput;
        cInput=rd.nextInt(3);
        System.out.println("Enter a number ");
        System.out.println(" 0 ==> Rock\n 1 ==> Paper\n 2 ==> Scissor");
        uInput=sc.nextInt();
        if (cInput==uInput){
            System.out.println("Match Draw !!!");
        }else if (cInput==0&&uInput==2||cInput==1&&uInput==0||cInput==2&&uInput==1){
            System.out.println("Computer Win (Robo Bitch) (-_-)");
        }else {
            System.out.println("You Win (Talented) (^_^)");
        }
        System.out.println("Computer Choice is "+cInput);
    }
}
