package com.company;

public class StarPatternUsingMethod {
    static void Pattern_1(int n){
        for(int i=0;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    static void Pattern_2(int n){
        for(int i=n;i>=0;i--){
            for (int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Top Bottom");
        Pattern_1(5);
        System.out.println("Bottom Down");
        Pattern_2(5);
    }
}
