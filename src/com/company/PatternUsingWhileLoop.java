package com.company;

public class PatternUsingWhileLoop {
    public static void main(String[] args) {
        int i=5,j=0;
        while (i>=0){
            while (j<=i){
                System.out.print("*"+"");
                j++;
            }
            System.out.print("\n");
            i--;
        }
    }
}
