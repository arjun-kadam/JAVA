package com.company;

public class BreakAndContinue {
    public static void main(String[] args) {
        //Break Statement
        int n=1;
        for (;n<=5;n++){
            System.out.println(n);
            if (n==3){
                break;
            }
            System.out.println("I am Not Breakable");
        }
        System.out.println("Out From For Loop Because Of 'Break'\n");

        //Continue Statement
        for (int m=1;m<=5;m++){
            System.out.print(m);
            if (m==2){
                System.out.println(" ==> Not Declarable Due To 'Continue'");
                continue;
            }
            System.out.println(" ==> I am : "+m);
        }
    }
}
