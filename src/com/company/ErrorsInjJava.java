package com.company;

public class ErrorsInjJava {
    public static void main(String[] args) {
        //Syntax Error
        int a=2;
        int b=6; //Semicolon Missing
        System.out.println("Add is "+(a+b));

        //Runtime Errors
        int num1=1;
        int  num2=0;
        System.out.println(num1/num2);

        //Logical Errors
       /* while (true){
            System.out.println("This is Infinite Loop");
        } */


    }
}
