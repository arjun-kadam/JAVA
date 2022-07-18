package com.company;

public class MakeArrayReverse {
    public static void main(String[] args) {
        int[] numbers={4,5,6,68,87,12,34};
        int temp;
        int length=numbers.length;
        int iterations=Math.floorDiv(length,2);
        //Swap logic
        for (int i=0;i<iterations;i++){
            temp=numbers[i];
            numbers[i]=numbers[length-i-1];
            numbers[length-i-1]=temp;
        }
        for (int element:numbers) {
            System.out.print(element+" ");
        }
    }
}
