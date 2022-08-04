package com.company;

import java.util.Random;
import java.util.Scanner;
class winner{
    Scanner sc=new Scanner(System.in);
    int comp,user;
    int count=0;
    //Getting Initial Input From user And Computer
    void setValue(int c_input,int u_input){
        comp=c_input;
        user=u_input;
    }
    //This Method Is For Re-Entering User Input
    void input(){
        System.out.println("Re-Enter Number ");
        user=sc.nextInt();
    }
    //This Is Comparing Logic and Counts No Of Steps For Guessing Number
    int logic(){

        if (comp==user){
            System.out.println("You Guessed it Correct");
            count++;
        }else if (comp<user){
            System.out.println("Enter Number Below Than "+user);
            count++;
            input();
            logic();
        }else {
            System.out.println("Enter Number Above Than "+user);
            count++;
            input();
            logic();
        }
        return count;
    }
}
public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rd= new Random();
        winner w1=new winner();
        int cInput,uInput;
        cInput= rd.nextInt(1,100);
        System.out.println("Enter a Number Between 1 to 100");
        uInput=sc.nextInt();
        w1.setValue(cInput,uInput);
        int rep= w1.logic();
        System.out.println("Number Of Reputation "+rep);
        System.out.println("Computer Input Was "+cInput);

    }
}
