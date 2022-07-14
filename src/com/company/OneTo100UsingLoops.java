package com.company;

public class OneTo100UsingLoops {
    public static void main(String[] args) {

        //While Loop
        int n=1;
        System.out.println("1 to 100 Using While Loop");
        while (n<=100){
            System.out.println(n);
            n++;
        }

        // Do While Loop
        System.out.println("1 to 100 Using Do While Loop");
        int dw=1;
        do {
            System.out.println(dw);
            dw++;
        }while (dw<=100);

        // For Loop
        System.out.println("1 to 100 Using For Loop");
        for (int f=1;f<=100;f++){
            System.out.println(f);
        }

    }
}
