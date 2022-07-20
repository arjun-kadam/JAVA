package com.company;

public class ArrayReferenceInMethods {
    static void change(int []ch){
        ch[0]=12;
    }
    public static void main(String[] args) {
        int[]marks={65,76,89,99,47,67};
        change(marks);
        System.out.println(marks[0]);

    }
}
