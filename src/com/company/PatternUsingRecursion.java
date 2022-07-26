package com.company;

public class PatternUsingRecursion {
    static void pattern1(int n){
        if (n>0){
            pattern1(n-1);
            for (int i=0;i<n;i++){
                System.out.print(" * ");
            }
            System.out.println();

        }
    }
    static void pattern2(int x){

        if (x>0){

            for (int i=x;i>=1;i--){
                System.out.print(" <==*==> ");
            }
            System.out.println();
            pattern2(x-1);
        }
    }
    public static void main(String[] args) {
        pattern1(5);
        System.out.println("Pattern 2");
        pattern2(5);
    }
}
