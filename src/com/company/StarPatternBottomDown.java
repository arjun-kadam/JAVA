package com.company;

public class StarPatternBottomDown {
    public static void main(String[] args) {
        //Star Pattern Bottom Down Approach
        for (int i=5;i>=0;i--){
            for (int j=0;j<=i;j++){
                System.out.print("*"+"");
            }
            System.out.print("\n");
        }
    }
}
